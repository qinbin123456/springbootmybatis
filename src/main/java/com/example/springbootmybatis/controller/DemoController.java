package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.model.Demo;
import com.example.springbootmybatis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * 测试获取单个数据
     * @return
     */
    @RequestMapping("getDemo")
    public Object getDemo(){

        return demoService.getAll();
    }

    /**
     * 测试添加数据
     * @param demo
     * @return
     */
    @RequestMapping(value="insertDemo")
    public String insertDemo(Demo demo){

        demoService.insertDemo(demo);
        return "SUCCESS";
    }

}
