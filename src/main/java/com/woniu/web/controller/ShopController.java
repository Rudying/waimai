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

import com.woniu.domain.Shop;
import com.woniu.service.IShopService;


@RestController
@RequestMapping("shop")
public class ShopController {
	@Autowired
	private IShopService ss;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Shop s) {	
		ss.save(s);
	
	}
	
	// 删除   
	@DeleteMapping("{sid}")   
	public void delete(@PathVariable Integer sid) {
		ss.delete(sid);
	}

	// 查询所有
	@GetMapping
	public List<Shop> findAll() {
		return ss.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Shop s) {
		ss.update(s);
	}

}
