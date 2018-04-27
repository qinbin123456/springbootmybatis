package com.example.springbootmybatis.mapper.java.com.example.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {
    /**
     * 前往登录首页
     * @return
     */
    @RequestMapping("login")
    public String toLogin(Model model){
        model.addAttribute("aa","22");
        model.addAttribute("bb","335");
        return "login";
    }
}
