package com.microblue.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 测试类
 * Created by admin on 2015/11/30.
 */
@Controller
public class LoginController
{
	
    @RequestMapping("/index")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
        System.out.println("login start");
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
