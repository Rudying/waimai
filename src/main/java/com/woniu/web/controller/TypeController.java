package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.domain.Type;
import com.woniu.service.ITypeService;


@RestController
@RequestMapping("type")
public class TypeController {
	
	@Resource
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
	@PostMapping("{tid}")   
	public void delete(@PathVariable Integer tid) {
		ts.delete(tid);
	}

	// 分页
	@PostMapping("find")
	public List<Type> findAll(Integer offset,Integer limit) {
		System.out.println(offset+":"+limit);
		return ts.findAll((offset-1)*limit,limit);
		
	}
	//查询到的所有行数
	@PostMapping("count")
	public Integer count() {
		return ts.findCount();	
	}

	// 修改
	@RequestMapping("update")
	public void update(Type type,MultipartFile photo,HttpServletRequest req) {	
		//删除旧图
		String path = req.getServletContext().getRealPath("/images");
		String oldFile = ts.findOne(type.getTid()).getTphoto();
		if (oldFile != null) {
			File temp = new File(path, oldFile);
			temp.delete();
		}
		//添加新图
		
		StringBuilder s = new StringBuilder();	
		String OldName = photo.getOriginalFilename();
		int lastDot = OldName.lastIndexOf(".");
		String ext = OldName.substring(lastDot); 	
		String newName = UUID.randomUUID().toString().replace("-", "")+ext;	
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
		ts.update(type);
	}

}
