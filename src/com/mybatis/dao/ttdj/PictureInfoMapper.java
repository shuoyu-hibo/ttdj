package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.PictureInfo;
import com.mybatis.entity.ttdj.PictureInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureInfoMapper {
    int countByExample(PictureInfoExample example);

    int deleteByExample(PictureInfoExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(PictureInfo record);

    int insertSelective(PictureInfo record);

    List<PictureInfo> selectByExample(PictureInfoExample example);

    PictureInfo selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") PictureInfo record, @Param("example") PictureInfoExample example);

    int updateByExample(@Param("record") PictureInfo record, @Param("example") PictureInfoExample example);

    int updateByPrimaryKeySelective(PictureInfo record);

    int updateByPrimaryKey(PictureInfo record);
}