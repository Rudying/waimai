package com.woniu.service;

import java.util.List;

import com.woniu.domain.Element;


public interface IElementService {
   void save(Element t);
   void delete(Integer id);
   void update(Element t);
   Element findOne(Integer id);
   List<Element> findAll();
}
