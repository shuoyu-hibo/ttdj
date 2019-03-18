package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.BusinessGroup;
import com.mybatis.entity.ttdj.BusinessGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessGroupMapper {
    int countByExample(BusinessGroupExample example);

    int deleteByExample(BusinessGroupExample example);

    int deleteByPrimaryKey(Integer busiGropId);

    int insert(BusinessGroup record);

    int insertSelective(BusinessGroup record);

    List<BusinessGroup> selectByExample(BusinessGroupExample example);

    BusinessGroup selectByPrimaryKey(Integer busiGropId);

    int updateByExampleSelective(@Param("record") BusinessGroup record, @Param("example") BusinessGroupExample example);

    int updateByExample(@Param("record") BusinessGroup record, @Param("example") BusinessGroupExample example);

    int updateByPrimaryKeySelective(BusinessGroup record);

    int updateByPrimaryKey(BusinessGroup record);
}