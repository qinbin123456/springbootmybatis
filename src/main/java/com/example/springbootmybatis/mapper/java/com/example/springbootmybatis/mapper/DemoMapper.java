package com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.model.Demo;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}