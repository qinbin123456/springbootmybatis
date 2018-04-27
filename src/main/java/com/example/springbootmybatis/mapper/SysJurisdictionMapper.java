package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.SysJurisdiction;

public interface SysJurisdictionMapper {
    int deleteByPrimaryKey(String jurisid);

    int insert(SysJurisdiction record);

    int insertSelective(SysJurisdiction record);

    SysJurisdiction selectByPrimaryKey(String jurisid);

    int updateByPrimaryKeySelective(SysJurisdiction record);

    int updateByPrimaryKey(SysJurisdiction record);
}