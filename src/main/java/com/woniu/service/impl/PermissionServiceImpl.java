package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.PermissionsMapper;
import com.woniu.domain.Permissions;
import com.woniu.service.IPermissionService;
@Service
public class PermissionServiceImpl implements IPermissionService{
@Autowired
private PermissionsMapper mapper;

	@Transactional
	@Override
	public void save(Permissions t) {
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
	public void update(Permissions t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Permissions findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Permissions> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

}
