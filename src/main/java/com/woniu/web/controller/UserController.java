package com.woniu.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Users;
import com.woniu.message.HttpUtils;
import com.woniu.service.IUserService;


@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private IUserService us;
	
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	
	public static Map<String,String> map = new HashMap<String,String>();
	
    //给用户发送短信验证码
	@PostMapping("sendMessage")
	public void message(@RequestBody String tel) {
		
		redisTemplate.opsForValue().set(tel, "1234");
		
		 String host = "http://dingxin.market.alicloudapi.com";
		    String path = "/dx/sendSms";
		    String method = "POST";
		    String appcode = "a1e8961ce5844303b4fcadd1673ae60c";
		    Map<String, String> headers = new HashMap<String, String>();
		    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
		    headers.put("Authorization", "APPCODE " + appcode);
		    Map<String, String> querys = new HashMap<String, String>();
		    querys.put("mobile", tel);
		    querys.put("param", "code:1234");
		    querys.put("tpl_id", "TP1711063");
		    Map<String, String> bodys = new HashMap<String, String>();

		    try {
		    	HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
		    	System.out.println(response.toString());
		    	//获取response的body
		    	//System.out.println(EntityUtils.toString(response.getEntity()));
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
	
	// 注册
	@PostMapping
	public void test(@RequestBody Users user,@RequestBody String authcode) {
		
		Integer uid = us.getUserId(user.getUsername());
		if(authcode.equals(redisTemplate.opsForValue().get(user.getPhoto()))) {
			redisTemplate.opsForValue().set(user.getPhoto(), null);
			//设置盐
			user.setSalt("wm");
			SimpleHash sh = new SimpleHash("md5", user.getPassword(), user.getSalt(), 1024);
			String hex = sh.toHex();
			user.setPassword(hex);
			us.save(user);
			us.saveRole(uid);
		}
	}
	//验证注册的账号是否重复
	@GetMapping("{username}")
	public String judge(@PathVariable String username) {
		Integer userId = us.getUserId(username);
		
		if(userId!=null) {
			
			return "false";
		}else {
			return "true";
		}
	}
	
	//判断是否登录
	@GetMapping("/isLogin")
	public Map<String,Object> isLogin() {
		Subject subject = SecurityUtils.getSubject();
		HashMap<String, Object> map2 = new HashMap<String,Object>();
		map2.put("isLogin", subject.isAuthenticated());
		if(subject.isAuthenticated()==true) {
			//获得当前登录账号 subject.getPrincipal()
			Object principal = subject.getPrincipal();
			map2.put("loginName", principal);
		}
		return map2;
	}
	
	//安全退出
	@PostMapping("/logout")
	public void logout(@RequestBody String loginName) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
	}

	// 登录
	@RequestMapping("login")
	public Users login(@RequestBody Users user,HttpServletRequest request) {
		// 获取当前的主体 
		Subject subject = SecurityUtils.getSubject();
		
		String name = map.get(user.getUsername());
		
		if(name==null) {
			UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
			subject.login(token);
			String loginName = subject.getPrincipal().toString();
			map.put(loginName, request.getSession().toString());
			return us.findOne(us.getUserId(user.getUsername()));
		}else {
			return null;
		}
	}

	// 删除   
	@DeleteMapping("{uid}")   
	public void delete(@PathVariable Integer uid) {
		us.delete(uid);
	}

	// 查询所有
	@GetMapping
	public List<Users> findAll() {
		return us.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Users user) {
		us.update(user);
	}

}
