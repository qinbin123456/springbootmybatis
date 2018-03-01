package com.example.springbootmybatis.serviceimpl;

import com.example.springbootmybatis.mapper.DemoMapper;
import com.example.springbootmybatis.model.Demo;
import com.example.springbootmybatis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public Demo getAll() {
        return demoMapper.selectByPrimaryKey(1);
    }

    @Override
    public int insertDemo(Demo demo) {
        demo.setCreateDate(new Date());
        return demoMapper.insert(demo);
    }
}
