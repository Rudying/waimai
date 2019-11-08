package com.woniu.service;

import java.util.List;

import com.woniu.domain.Permissions;


public interface IPermissionService {
   void save(Permissions t);
   void delete(Integer id);
   void update(Permissions t);
   Permissions findOne(Integer id);
   List<Permissions> findAll();
}
