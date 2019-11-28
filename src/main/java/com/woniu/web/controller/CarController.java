package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
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
	
	//根据uid找购物车
	@PostMapping("{uid}")
	public List<Car> findByUid(@PathVariable Integer uid){
		return service.findByUid(uid);
		
	}
	//根据uid和sid找购物车
	@PostMapping
	public List<Car> findBySidAndUid(Integer sid,Integer uid){
		return service.findBySidAndUid(sid, uid);
		
	}
	
	//计算某一个人购物车的总价格
	@PostMapping("findPrice/{uid}")
	public Double findPrice(@PathVariable Integer uid) {
		return service.findPrice(uid);
	}
	
}
