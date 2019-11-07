package com.woniu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UsersMapper;
import com.woniu.domain.Users;

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

	@Override
	public Users findOne(Integer uid) {
		return um.selectByPrimaryKey(uid);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return um.selectByExample(null);
	}

}
