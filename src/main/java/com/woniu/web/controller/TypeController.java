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

import com.woniu.domain.Type;
import com.woniu.service.ITypeService;


@RestController
@RequestMapping("type")
public class TypeController {
	@Autowired
	private ITypeService ts;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Type t) {	
	ts.save(t);
	
	}
	
	// 删除   
	@DeleteMapping("{tid}")   
	public void delete(@PathVariable Integer tid) {
		ts.delete(tid);
	}

	// 查询所有
	@GetMapping
	public List<Type> findAll() {
		return ts.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Type t) {
		ts.update(t);
	}

}
