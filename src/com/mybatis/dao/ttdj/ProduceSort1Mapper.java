package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.ProduceSort1;
import com.mybatis.entity.ttdj.ProduceSort1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceSort1Mapper {
    int countByExample(ProduceSort1Example example);

    int deleteByExample(ProduceSort1Example example);

    int deleteByPrimaryKey(Integer proSortCode);

    int insert(ProduceSort1 record);

    int insertSelective(ProduceSort1 record);

    List<ProduceSort1> selectByExample(ProduceSort1Example example);

    ProduceSort1 selectByPrimaryKey(Integer proSortCode);

    int updateByExampleSelective(@Param("record") ProduceSort1 record, @Param("example") ProduceSort1Example example);

    int updateByExample(@Param("record") ProduceSort1 record, @Param("example") ProduceSort1Example example);

    int updateByPrimaryKeySelective(ProduceSort1 record);

    int updateByPrimaryKey(ProduceSort1 record);
}