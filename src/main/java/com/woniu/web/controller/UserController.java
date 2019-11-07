package com.woniu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.service.UserServiceImpl;


@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UserServiceImpl us;
	
	  @GetMapping
	   	public void test(){
		  System.out.println("test");
   	}
	
}
