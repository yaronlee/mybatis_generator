package com.cskaoyan.mapper;

import com.cskaoyan.bean.Clazz;

public interface ClazzMapper {
    int deleteByPrimaryKey(String id);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}