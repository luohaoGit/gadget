package com.github.wx.gadget.mybatis.mapper;

import com.github.wx.gadget.dbo.Tear;

import java.util.List;

public interface TearMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tear record);

    int insertSelective(Tear record);

    Tear selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tear record);

    int updateByPrimaryKey(Tear record);

    List<Tear> all();
}