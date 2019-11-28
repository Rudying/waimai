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

	//注册商铺
	@PostMapping
	public void test(Shop s) {
//		int id = Integer.parseInt(uid);
//		s.setUid(id);
		ss.save(s);
	}
	
	//根据uid查询
	@PostMapping("{uid}")
	public Shop findOne(@PathVariable Integer uid) {
		return ss.findShopByUid(uid);
	}
	
	//改变商铺营业状态
	@PostMapping("change/{sid}")
	public void change(@PathVariable Integer sid) {
		Shop shop = ss.findOne(sid);
		shop.setSstatus(shop.getSstatus()==1?0:1);
		ss.update(shop);
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
