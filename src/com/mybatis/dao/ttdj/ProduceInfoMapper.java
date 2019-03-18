package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.ProduceInfo;
import com.mybatis.entity.ttdj.ProduceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceInfoMapper {
    int countByExample(ProduceInfoExample example);

    int deleteByExample(ProduceInfoExample example);

    int deleteByPrimaryKey(Integer produceId);

    int insert(ProduceInfo record);

    int insertSelective(ProduceInfo record);

    List<ProduceInfo> selectByExample(ProduceInfoExample example);

    ProduceInfo selectByPrimaryKey(Integer produceId);

    int updateByExampleSelective(@Param("record") ProduceInfo record, @Param("example") ProduceInfoExample example);

    int updateByExample(@Param("record") ProduceInfo record, @Param("example") ProduceInfoExample example);

    int updateByPrimaryKeySelective(ProduceInfo record);

    int updateByPrimaryKey(ProduceInfo record);
}