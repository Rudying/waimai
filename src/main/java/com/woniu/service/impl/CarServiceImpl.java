package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.CarMapper;
import com.woniu.domain.Car;
import com.woniu.service.ICarService;

@Service
public class CarServiceImpl implements ICarService{
	@Resource
	private CarMapper mapper;

	@Transactional
	@Override
	public void save(Car t) {
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
	public void update(Car t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Car findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Car> findByUid(Integer uid) {
		// TODO Auto-generated method stub
		return mapper.findByUid(uid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Car> findBySidAndUid(Integer sid, Integer uid) {
		// TODO Auto-generated method stub
		return mapper.findBySidAndUid(sid, uid);
	}

	@Override
	public Double findPrice(Integer uid) {
		// TODO Auto-generated method stub
		return mapper.findPrice(uid);
	}

}
