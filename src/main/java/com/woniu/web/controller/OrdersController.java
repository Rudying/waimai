package com.woniu.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.woniu.domain.Car;
import com.woniu.domain.Orders;
import com.woniu.service.ICarService;
import com.woniu.service.IOrderService;


@RestController
@RequestMapping("orders")
public class OrdersController {
	@Resource
	private IOrderService os;
	@Resource
	private ICarService cs;

	// 添加订单
	@PostMapping("save")
	public void save(Orders o) {
		//添加订单
		List<Integer>shop=new ArrayList<Integer>();
		List<Car> cars = cs.findByUid(o.getUid());
		for (Car car : cars) {
			Integer sid = car.getShop().getSid();			
			if(!shop.contains(sid)) {
				shop.add(sid);
			}
		}
		for (Integer s : shop) {
			o.setSid(s);
			String str=UUID.randomUUID().toString();
			o.setOnumber(str.substring(0, str.indexOf("-")));
			o.setCreatetime(new Date());
			os.save(o);
		}
		
		for (Car car : cars) {
			cs.delete(car.getCaid());
		}
		
	}
		
	// 删除   
	@DeleteMapping("{oid}")   
	public void delete(@PathVariable Integer oid) {
		os.delete(oid);
	}

	// 查询所有
	@GetMapping
	public List<Orders> findAll() {
		return os.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Orders o) {
		os.update(o);
	}

}
