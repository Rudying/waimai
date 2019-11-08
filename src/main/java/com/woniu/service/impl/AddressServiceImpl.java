package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.UserAddressMapper;
import com.woniu.domain.UserAddress;
import com.woniu.service.IAddressService;
@Service
public class AddressServiceImpl implements IAddressService{
@Autowired
private UserAddressMapper mapper;

	@Transactional
	@Override
	public void save(UserAddress t) {
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
	public void update(UserAddress t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public UserAddress findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<UserAddress> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
