package com.woniu.service;

import java.util.List;

import com.woniu.domain.Orders;


public interface IOrderService {
   void save(Orders t);
   void delete(Integer id);
   void update(Orders t);
   Orders findOne(Integer id);
   List<Orders> findAll();
}
