package com.woniu.web.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
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
import com.woniu.service.UserServiceImpl;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UserServiceImpl us;

	// 注册
	@PostMapping
	public void test(@RequestBody Users user) {
		SimpleHash sh = new SimpleHash("md5", user.getPassword(), user.getSalt(), 1024);
		String hex = sh.toHex();
		user.setPassword(hex);
		us.save(user);
	}

	// 登录
	@RequestMapping("login")
	public void login(@RequestBody Users user) {
		// 获取当前的主体
		Subject subject = SecurityUtils.getSubject();

		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
		try {
			subject.login(token);
			System.out.println("登录成功");
		} catch (AuthenticationException e) {
			e.printStackTrace();
			System.out.println("登录失败");
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
