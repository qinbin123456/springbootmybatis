package com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
}
