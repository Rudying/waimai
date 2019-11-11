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

import com.woniu.domain.Comment;
import com.woniu.service.ICommentService;


@RestController
@RequestMapping("comment")
public class CommentController {
	@Autowired
	private ICommentService cs;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Comment c) {	
		cs.save(c);
	
	}
	
	// 删除   
	@DeleteMapping("{cid}")   
	public void delete(@PathVariable Integer cid) {
		cs.delete(cid);
	}

	// 查询所有
	@GetMapping
	public List<Comment> findAll() {
		return cs.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Comment c) {
		cs.update(c);
	}

}
