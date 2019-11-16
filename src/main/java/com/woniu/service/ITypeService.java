package com.woniu.service;

import java.util.List;

import com.woniu.domain.Type;


public interface ITypeService {
   void save(Type t);
   void delete(Integer id);
   void update(Type t);
   Type findOne(Integer id);
   List<Type> findAll(Integer currentPage, Integer pageSize);
   Integer findCount();
   List<Type>findAllType();
}
