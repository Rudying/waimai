package com.woniu.service;

import java.util.List;

import com.woniu.domain.UserAddress;

public interface IAddressService {
	   void save(UserAddress t);
	   void delete(Integer id);
	   void update(UserAddress t);
	   UserAddress findOne(Integer id);
	   List<UserAddress> findAll();
	   List<UserAddress> findUserAndAddress();
	   List<UserAddress> findByUid(Integer uid);
}
