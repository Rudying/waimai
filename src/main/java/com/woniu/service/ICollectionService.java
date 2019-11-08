package com.woniu.service;

import java.util.List;

import com.woniu.domain.Collection;


public interface ICollectionService {
   void save(Collection t);
   void delete(Integer id);
   void update(Collection t);
   Collection findOne(Integer id);
   List<Collection> findAll();
}
