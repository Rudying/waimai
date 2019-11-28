package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.FoodMapper;
import com.woniu.domain.Food;
import com.woniu.service.IFoodService;
@Service
public class FoodServiceImpl implements IFoodService{
@Autowired
private FoodMapper mapper;

	@Transactional
	@Override
	public void save(Food t) {
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
	public void update(Food t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Food findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Food> findAll(Integer currentPage, Integer pageSize){
		// TODO Auto-generated method stub
		return mapper.findAll(new RowBounds(currentPage, pageSize));
	}

	@Transactional(readOnly = true)
	@Override
	public List<Food> findBySid(Integer currentPage, Integer pageSize,Integer sid){
		// TODO Auto-generated method stub
		return mapper.findBySid(new RowBounds(currentPage, pageSize),sid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Integer findCount() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null).size();
	}


}
