package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.ProvinceInfo;
import com.mybatis.entity.ttdj.ProvinceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceInfoMapper {
    int countByExample(ProvinceInfoExample example);

    int deleteByExample(ProvinceInfoExample example);

    int deleteByPrimaryKey(Integer provinceCode);

    int insert(ProvinceInfo record);

    int insertSelective(ProvinceInfo record);

    List<ProvinceInfo> selectByExample(ProvinceInfoExample example);

    ProvinceInfo selectByPrimaryKey(Integer provinceCode);

    int updateByExampleSelective(@Param("record") ProvinceInfo record, @Param("example") ProvinceInfoExample example);

    int updateByExample(@Param("record") ProvinceInfo record, @Param("example") ProvinceInfoExample example);

    int updateByPrimaryKeySelective(ProvinceInfo record);

    int updateByPrimaryKey(ProvinceInfo record);
}