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

import com.woniu.domain.Logs;
import com.woniu.service.ILogService;


@RestController
@RequestMapping("logs")
public class LogsController {
	@Autowired
	private ILogService ls;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Logs l) {	
		ls.save(l);
	
	}
	
	// 删除   
	@DeleteMapping("{lid}")   
	public void delete(@PathVariable Integer lid) {
		ls.delete(lid);
	}

	// 查询所有
	@GetMapping
	public List<Logs> findAll() {
		return ls.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Logs l) {
		ls.update(l);
	}

}
