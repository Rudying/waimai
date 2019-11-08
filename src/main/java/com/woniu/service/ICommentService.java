package com.woniu.service;

import java.util.List;

import com.woniu.domain.Comment;


public interface ICommentService {
   void save(Comment t);
   void delete(Integer id);
   void update(Comment t);
   Comment findOne(Integer id);
   List<Comment> findAll();
}
