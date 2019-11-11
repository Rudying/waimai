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

import com.woniu.domain.Collection;
import com.woniu.service.ICollectionService;


@RestController
@RequestMapping("collection")
public class CollectionController {
	@Autowired
	private ICollectionService cts;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Collection c) {	
		cts.save(c);
	
	}
	
	// 删除   
	@DeleteMapping("{ctid}")   
	public void delete(@PathVariable Integer ctid) {
		cts.delete(ctid);
	}

	// 查询所有
	@GetMapping
	public List<Collection> findAll() {
		return cts.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Collection c) {
		cts.update(c);
	}

}
