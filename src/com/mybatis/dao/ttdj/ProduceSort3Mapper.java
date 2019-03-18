package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.ProduceSort3;
import com.mybatis.entity.ttdj.ProduceSort3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceSort3Mapper {
    int countByExample(ProduceSort3Example example);

    int deleteByExample(ProduceSort3Example example);

    int deleteByPrimaryKey(Integer proSort3Code);

    int insert(ProduceSort3 record);

    int insertSelective(ProduceSort3 record);

    List<ProduceSort3> selectByExample(ProduceSort3Example example);

    ProduceSort3 selectByPrimaryKey(Integer proSort3Code);

    int updateByExampleSelective(@Param("record") ProduceSort3 record, @Param("example") ProduceSort3Example example);

    int updateByExample(@Param("record") ProduceSort3 record, @Param("example") ProduceSort3Example example);

    int updateByPrimaryKeySelective(ProduceSort3 record);

    int updateByPrimaryKey(ProduceSort3 record);
}