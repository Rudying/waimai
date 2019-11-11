package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Advice;
import com.woniu.service.IAdviceService;

@RestController
@RequestMapping("advices")
public class AdviceController {
@Autowired
private IAdviceService service;

@GetMapping
public List<Advice> findAll(){
	return service.findAll();
 }
@PostMapping(value="{id}")
public void delete(@PathVariable Integer id) {
	service.delete(id);
}
@RequestMapping("change")
public void change(Integer astatus,Integer adid) {
	Advice t=new Advice();
	t.setAstatus(astatus==0?1:0);
	t.setAdid(adid);
	service.update(t);
}
}
