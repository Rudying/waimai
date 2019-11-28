package com.woniu.service;

import java.util.List;

import com.woniu.domain.Car;

public interface ICarService {
	   void save(Car t);
	   void delete(Integer id);
	   void update(Car t);
	   Car findOne(Integer id);
	   List<Car> findAll();
	   List<Car> findByUid(Integer uid);
	   List<Car> findBySidAndUid(Integer sid,Integer uid);
	   Double findPrice(Integer uid);
}
