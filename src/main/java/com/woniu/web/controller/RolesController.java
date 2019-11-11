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

import com.woniu.domain.Roles;
import com.woniu.service.IRolesService;


@RestController
@RequestMapping("roles")
public class RolesController {
	@Autowired
	private IRolesService rs;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Roles r) {	
		rs.save(r);
	
	}
	
	// 删除   
	@DeleteMapping("{rid}")   
	public void delete(@PathVariable Integer rid) {
		rs.delete(rid);
	}

	// 查询所有
	@GetMapping
	public List<Roles> findAll() {
		return rs.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Roles r) {
		rs.update(r);
	}

}
