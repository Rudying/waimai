package com.woniu.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Users;
import com.woniu.service.IUserService;
import com.woniu.service.impl.UserServiceImpl;


@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private IUserService us;
	
	public static Map<String,String> map = new HashMap<String,String>();
	

	// 注册
	@PostMapping
	public void test(@RequestBody Users user) {
		//设置盐
		user.setSalt("wm");
		
		SimpleHash sh = new SimpleHash("md5", user.getPassword(), user.getSalt(), 1024);
		String hex = sh.toHex();
		user.setPassword(hex);
		us.save(user);
		Integer uid = us.getUserId(user.getUsername());
		us.saveRole(uid);
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
		System.out.println("前段session"+subject.getSession().getId());
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
	@PostMapping("/aaa")
	public String findAll(@RequestBody String loginName) {
		System.out.println("UserController.findAll()"+loginName);
		return "123";
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Users user) {
		us.update(user);
	}

}
