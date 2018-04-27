package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.SysRoleJurisdiction;

public interface SysRoleJurisdictionMapper {
    int deleteByPrimaryKey(String rjid);

    int insert(SysRoleJurisdiction record);

    int insertSelective(SysRoleJurisdiction record);

    SysRoleJurisdiction selectByPrimaryKey(String rjid);

    int updateByPrimaryKeySelective(SysRoleJurisdiction record);

    int updateByPrimaryKey(SysRoleJurisdiction record);
}