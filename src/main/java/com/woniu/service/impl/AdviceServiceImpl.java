package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.AdviceMapper;
import com.woniu.domain.Advice;
import com.woniu.service.IAdviceService;
@Service
public class AdviceServiceImpl implements IAdviceService{
@Autowired
private AdviceMapper mapper;

	@Transactional
	@Override
	public void save(Advice t) {
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
	public void update(Advice t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Advice findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Advice> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
