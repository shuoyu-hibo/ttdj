package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.CountyInfo;
import com.mybatis.entity.ttdj.CountyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountyInfoMapper {
    int countByExample(CountyInfoExample example);

    int deleteByExample(CountyInfoExample example);

    int deleteByPrimaryKey(Integer countyId);

    int insert(CountyInfo record);

    int insertSelective(CountyInfo record);

    List<CountyInfo> selectByExample(CountyInfoExample example);

    CountyInfo selectByPrimaryKey(Integer countyId);

    int updateByExampleSelective(@Param("record") CountyInfo record, @Param("example") CountyInfoExample example);

    int updateByExample(@Param("record") CountyInfo record, @Param("example") CountyInfoExample example);

    int updateByPrimaryKeySelective(CountyInfo record);

    int updateByPrimaryKey(CountyInfo record);
}