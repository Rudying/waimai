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

import com.woniu.domain.Food;
import com.woniu.service.IFoodService;


@RestController
@RequestMapping("food")
public class FoodController {
	@Autowired
	private IFoodService fs;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Food f) {	
		fs.save(f);
	
	}
	
	// 删除   
	@DeleteMapping("{fid}")   
	public void delete(@PathVariable Integer fid) {
		fs.delete(fid);
	}

	// 查询所有
	@GetMapping
	public List<Food> findAll() {
		return fs.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Food f) {
		fs.update(f);
	}

}
