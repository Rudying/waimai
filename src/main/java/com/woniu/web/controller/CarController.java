package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Car;
import com.woniu.service.ICarService;

@RestController
@RequestMapping("car")
public class CarController {
	@Resource
	private ICarService service;
	
	@PostMapping("{uid}")
	public List<Car> findByUid(@PathVariable Integer uid){
		return service.findByUid(uid);
		
	}

}
