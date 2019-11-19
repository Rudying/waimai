package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.CollectionMapper;
import com.woniu.domain.Collection;
import com.woniu.service.ICollectionService;
@Service
public class CollectionServiceImpl implements ICollectionService{
@Autowired
private CollectionMapper mapper;

	@Transactional
	@Override
	public void save(Collection t) {
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
	public void update(Collection t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Collection findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Collection> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

}
