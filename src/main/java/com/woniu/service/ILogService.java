package com.woniu.service;

import java.util.List;

import com.woniu.domain.Logs;


public interface ILogService {
   void save(Logs t);
   void delete(Integer id);
   void update(Logs t);
   Logs findOne(Integer id);
   List<Logs> findAll();
}
