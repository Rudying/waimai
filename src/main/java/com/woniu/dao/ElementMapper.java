package com.woniu.dao;

import com.woniu.domain.Element;
import com.woniu.domain.ElementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementMapper {
    long countByExample(ElementExample example);

    int deleteByExample(ElementExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Element record);

    int insertSelective(Element record);

    List<Element> selectByExample(ElementExample example);

    Element selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Element record, @Param("example") ElementExample example);

    int updateByExample(@Param("record") Element record, @Param("example") ElementExample example);

    int updateByPrimaryKeySelective(Element record);

    int updateByPrimaryKey(Element record);
    
    List<Element> findAll();
    
    List<Element> findElementByOnumber(String num);
}