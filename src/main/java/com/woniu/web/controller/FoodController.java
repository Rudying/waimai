package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.domain.Food;
import com.woniu.service.IFoodService;

@RestController
@RequestMapping("food")
public class FoodController {
	@Autowired
	private IFoodService fs;

	// 添加菜品
	@PostMapping
	public void test(Food f, MultipartFile[] photo, HttpServletRequest request)
			throws IllegalStateException, IOException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < photo.length; i++) {
			String oldName = photo[i].getOriginalFilename();
			String hz = oldName.substring(oldName.lastIndexOf("."));
			String newName = UUID.randomUUID().toString().replaceAll("-", "") + hz;
			String path = request.getServletContext().getRealPath("/images");
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			photo[i].transferTo(new File(path, newName));
			sb.append(newName);
			sb.append(",");
		}
		// 将多个照片的地址用逗号隔开储存在数据库并且删掉最后一个逗号
		sb.deleteCharAt(sb.length() - 1);
		f.setFphoto(sb.toString());
		fs.save(f);

	}

	// 删除
	@PostMapping(value = "/{id}")
	public void delete(@PathVariable int id, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/images");
		String oldFile = fs.findOne(id).getFphoto();
		if (oldFile.contains(",")) {
			String[] strs = oldFile.split(",");
			for (int i = 0; i < strs.length; i++) {
				File temp = new File(path, strs[i]);
				temp.delete();
			}
		} else {
			File temp = new File(path, oldFile);
			temp.delete();
		}
		fs.delete(id);
	}

	// 查询所有
	@PostMapping("find")
	public List<Food> findAll(Integer currentPage,Integer pageSize) {
		return fs.findAll(new RowBounds(currentPage, pageSize));
	}

	// 修改
	@RequestMapping("update")
	public void update(Food f, MultipartFile[] photo, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 删除旧图片
		String path = request.getServletContext().getRealPath("/images");
		String oldFile = fs.findOne(f.getFid()).getFphoto();
		if (oldFile != null) {
			if (oldFile.contains(",")) {
				String[] strs = oldFile.split(",");
				for (int i = 0; i < strs.length; i++) {
					File temp = new File(path, strs[i]);
					temp.delete();
				}
			} else {
				File temp = new File(path, oldFile);
				temp.delete();
			}
		}
		// 添加新图片
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < photo.length; i++) {
			String oldName = photo[i].getOriginalFilename();
			String hz = oldName.substring(oldName.lastIndexOf("."));
			String newName = UUID.randomUUID().toString().replaceAll("-", "") + hz;
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			photo[i].transferTo(new File(path, newName));
			sb.append(newName);
			sb.append(",");
		}
		// 将多个照片的地址用逗号隔开储存在数据库并且删掉最后一个逗号
		sb.deleteCharAt(sb.length() - 1);
		f.setFphoto(sb.toString());
		fs.update(f);
	}

}
