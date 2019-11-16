package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.UserAddress;
import com.woniu.service.IAddressService;

@RestController
@RequestMapping("address")
public class AddressController {
@Resource
private IAddressService service;

@GetMapping
public List<UserAddress> findAll(){
	return service.findUserAndAddress();
	
}
}
