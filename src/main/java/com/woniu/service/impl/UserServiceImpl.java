package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UsersMapper;
import com.woniu.domain.Users;
import com.woniu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
    
	@Autowired
	private UsersMapper um;
	
	@Transactional
	@Override
	public void save(Users user) {
		um.insertSelective(user);
		
	}
	@Transactional
	@Override
	public void delete(Integer uid) {
		um.deleteByPrimaryKey(uid);
	}
	@Transactional
	@Override
	public void update(Users user) {
		um.updateByPrimaryKeySelective(user);
	}

	@Transactional(readOnly = true)
	@Override
	public Users findOne(Integer uid) {
		return um.selectByPrimaryKey(uid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return um.selectByExample(null);
	}
	@Override
	public void saveRole(Integer uid) {
		// TODO Auto-generated method stub
		um.saveRole(uid);
	}
	@Override
	public Integer getUserId(String username) {
		return um.getUserId(username);
	}

}
