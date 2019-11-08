package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.CommentMapper;
import com.woniu.domain.Comment;
import com.woniu.service.ICommentService;
@Service
public class CommentServiceImpl implements ICommentService{
@Autowired
private CommentMapper mapper;

	@Transactional
	@Override
	public void save(Comment t) {
		// TODO Auto-generated method stub
		
		mapper.insertSelective(t);
	}

	@Transactional
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public void update(Comment t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Comment findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
