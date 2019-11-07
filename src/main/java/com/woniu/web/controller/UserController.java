package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping
	public void test(@RequestBody Users user) {
		us.save(user);
	}

}
