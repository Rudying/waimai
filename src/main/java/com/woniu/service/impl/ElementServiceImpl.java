package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniu.dao.ElementMapper;
import com.woniu.domain.Element;
import com.woniu.service.IElementService;
@Service
public class ElementServiceImpl implements IElementService{
@Autowired
private ElementMapper mapper;

	@Transactional
	@Override
	public void save(Element t) {
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
	public void update(Element t) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Element findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Element> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Element> findElementByOnumber(String num) {
		// TODO Auto-generated method stub
		return mapper.findElementByOnumber(num);
	}


}
