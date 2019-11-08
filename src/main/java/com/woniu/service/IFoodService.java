package com.woniu.service;

import java.util.List;

import com.woniu.domain.Food;


public interface IFoodService {
   void save(Food t);
   void delete(Integer id);
   void update(Food t);
   Food findOne(Integer id);
   List<Food> findAll();
}
