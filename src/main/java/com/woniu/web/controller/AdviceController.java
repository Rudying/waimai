package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Advice;
import com.woniu.service.IAdviceService;


@RestController
@RequestMapping("advice")
public class AdviceController {
	@Autowired
	private IAdviceService as;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Advice a) {	
		as.save(a);
	
	}
	
	// 删除   
	@DeleteMapping("{aid}")   
	public void delete(@PathVariable Integer aid) {
		as.delete(aid);
	}

	// 查询所有
	@GetMapping
	public List<Advice> findAll() {
		return as.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Advice a) {
		as.update(a);
	}

}
