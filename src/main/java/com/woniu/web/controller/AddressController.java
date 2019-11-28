package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

//根据uid找到该用户的地址
@PostMapping("{uid}")
public List<UserAddress>findByUid(@PathVariable Integer uid){
	return service.findByUid(uid);
}

//添加新地址
@PostMapping
public void save(UserAddress address) {
	service.save(address);
}

//添加新地址
@PostMapping("update")
public void update(UserAddress address) {
	service.update(address);
}

}
