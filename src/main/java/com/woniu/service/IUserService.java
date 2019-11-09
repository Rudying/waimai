package com.woniu.service;

import java.util.List;

import com.woniu.domain.Users;


public interface IUserService {
   void save(Users user);
   void delete(Integer uid);
   void update(Users user);
   Users findOne(Integer uid);
   List<Users> findAll();
   void saveRole(Integer uid);
   Integer getUserId(String username);
   
}
