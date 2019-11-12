package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.domain.Type;
import com.woniu.service.ITypeService;


@RestController
@RequestMapping("type")
public class TypeController {
	@Autowired
	private ITypeService ts;

	// 添加图片
	@PostMapping
	public void test(Type type,MultipartFile photo,HttpServletRequest req) {	
		StringBuilder s = new StringBuilder();	
		String OldName = photo.getOriginalFilename();
		int lastDot = OldName.lastIndexOf(".");
		String ext = OldName.substring(lastDot); 
		
		String newName = UUID.randomUUID().toString().replace("-", "")+ext;
		
		String path = req.getServletContext().getRealPath("/images");
		
		System.out.println(path);
		File dir = new File(path);
		if(!dir.exists()){
			dir.mkdirs();
		}
		
		try {
			photo.transferTo(new File(path,newName));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.append(newName);
		s.append(",");
		s.deleteCharAt(s.length()-1);
		type.setTphoto(s.toString());
		ts.save(type);
	
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
