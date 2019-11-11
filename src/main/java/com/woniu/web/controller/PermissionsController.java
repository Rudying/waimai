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

import com.woniu.domain.Permissions;
import com.woniu.service.IPermissionService;


@RestController
@RequestMapping("permissions")
public class PermissionsController {
	@Autowired
	private IPermissionService ps;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Permissions p) {	
		ps.save(p);
	
	}
	
	// 删除   
	@DeleteMapping("{pid}")   
	public void delete(@PathVariable Integer pid) {
		ps.delete(pid);
	}

	// 查询所有
	@GetMapping
	public List<Permissions> findAll() {
		return ps.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Permissions p) {
		ps.update(p);
	}

}
