package com.microblue.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.microblue.biz.Service.UserService;

@Controller
public class LoginController
{

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("login start");
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam("userName") String userName, @RequestParam("password") String password)
	{
		
		return JSONObject.toJSONString(String.valueOf(userService.Login(userName, password)));
		
	}
}
