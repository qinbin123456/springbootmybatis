package com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.service;

import com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.model.Demo;


public interface DemoService {

    Demo getAll();

    int  insertDemo(Demo demo);
}
