package com.woniu.service;

import java.util.List;

import com.woniu.domain.Roles;


public interface IRolesService {
   void save(Roles t);
   void delete(Integer id);
   void update(Roles t);
   Roles findOne(Integer id);
   List<Roles> findAll();
}
