package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.SysAdminRole;

public interface SysAdminRoleMapper {
    int deleteByPrimaryKey(String arid);

    int insert(SysAdminRole record);

    int insertSelective(SysAdminRole record);

    SysAdminRole selectByPrimaryKey(String arid);

    int updateByPrimaryKeySelective(SysAdminRole record);

    int updateByPrimaryKey(SysAdminRole record);
}