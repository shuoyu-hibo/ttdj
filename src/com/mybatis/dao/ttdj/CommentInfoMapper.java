package com.mybatis.dao.ttdj;

import com.mybatis.entity.ttdj.CommentInfo;
import com.mybatis.entity.ttdj.CommentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentInfoMapper {
    int countByExample(CommentInfoExample example);

    int deleteByExample(CommentInfoExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    List<CommentInfo> selectByExample(CommentInfoExample example);

    CommentInfo selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByExample(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);
}