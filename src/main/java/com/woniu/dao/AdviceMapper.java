package com.woniu.dao;

import com.woniu.domain.Advice;
import com.woniu.domain.AdviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdviceMapper {
    long countByExample(AdviceExample example);

    int deleteByExample(AdviceExample example);

    int deleteByPrimaryKey(Integer adid);

    int insert(Advice record);

    int insertSelective(Advice record);

    List<Advice> selectByExample(AdviceExample example);

    Advice selectByPrimaryKey(Integer adid);

    int updateByExampleSelective(@Param("record") Advice record, @Param("example") AdviceExample example);

    int updateByExample(@Param("record") Advice record, @Param("example") AdviceExample example);

    int updateByPrimaryKeySelective(Advice record);

    int updateByPrimaryKey(Advice record);
    
    List<Advice>findAll();
}