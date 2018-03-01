package com.example.springbootmybatis.service;

import com.example.springbootmybatis.model.Demo;


public interface DemoService {

    Demo getAll();

    int  insertDemo(Demo demo);
}
