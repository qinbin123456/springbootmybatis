package com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.serviceimpl;

import com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.mapper.DemoMapper;
import com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.model.Demo;
import com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService {

    private final Logger looger = LoggerFactory.getLogger(DemoServiceImpl.class);
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public Demo getAll() {
        looger.info("测试日志记录");

        return demoMapper.selectByPrimaryKey(1);
    }

    @Override
    public int insertDemo(Demo demo) {
        demo.setCreateDate(new Date());
        return demoMapper.insert(demo);
    }
}
