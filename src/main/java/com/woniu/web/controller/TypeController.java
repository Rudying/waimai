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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public void test(Type type,MultipartFile[] photo,HttpServletRequest request) throws IllegalStateException, IOException {	
		StringBuilder sb=new StringBuilder();
		System.out.println(photo);
		for (int i = 0; i < photo.length; i++) {
			String oldName=photo[i].getOriginalFilename();
		    String hz=oldName.substring(oldName.lastIndexOf("."));
		    String newName=UUID.randomUUID().toString().replaceAll("-", "")+hz;
		    String path=request.getServletContext().getRealPath("/images");
		    System.out.println(path);
		    File dir=new File(path);
		    if (!dir.exists()) {
				dir.mkdirs();
			}
		    photo[i].transferTo(new File(path, newName));
		    sb.append(newName);
		    sb.append(",");
		}
		//将多个照片的地址用逗号隔开储存在数据库并且删掉最后一个逗号
		sb.deleteCharAt(sb.length()-1);
		type.setTphoto(sb.toString());
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
		System.out.println();
		return ts.findAll();
	}

	// 修改
	@RequestMapping("update")
	public void update(Type type) {		
		ts.update(type);
	}

}
