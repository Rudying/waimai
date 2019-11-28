package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.ShopMapper;
import com.woniu.domain.Shop;
import com.woniu.service.IShopService;
@Service
public class ShopServiceImpl implements IShopService{
@Autowired
private ShopMapper mapper;

	@Transactional
	@Override
	public void save(Shop t) {
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
	public void update(Shop t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Shop findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Shop> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Shop findShopByUid(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findShopByUid(id);
	}

}
