package com.woniu.service;

import java.util.List;
import com.woniu.domain.Advice;

public interface IAdviceService {
   void save(Advice t);
   void delete(Integer id);
   void update(Advice t);
   Advice findOne(Integer id);
   List<Advice> findAll();
}
