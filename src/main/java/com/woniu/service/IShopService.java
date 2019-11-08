package com.woniu.service;

import java.util.List;

import com.woniu.domain.Shop;


public interface IShopService {
   void save(Shop t);
   void delete(Integer id);
   void update(Shop t);
   Shop findOne(Integer id);
   List<Shop> findAll();
}
