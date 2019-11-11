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

import com.woniu.domain.Element;
import com.woniu.service.IElementService;


@RestController
@RequestMapping("element")
public class ElementController {
	@Autowired
	private IElementService es;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Element e) {	
		es.save(e);
	
	}
	
	// 删除   
	@DeleteMapping("{eid}")   
	public void delete(@PathVariable Integer eid) {
		es.delete(eid);
	}

	// 查询所有
	@GetMapping
	public List<Element> findAll() {
		return es.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Element e) {
		es.update(e);
	}

}
