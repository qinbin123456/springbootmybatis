package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.SysAdmin;

public interface SysAdminMapper {
    int deleteByPrimaryKey(String adminid);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    SysAdmin selectByPrimaryKey(String adminid);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);
}