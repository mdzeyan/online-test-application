package com.online.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	String home()
	{
		return "index";
	}
	
	@RequestMapping("registration")
	String registration()
	{
		return "registration";
	}
	
	@RequestMapping("login")
	String login()
	{
		return "login";
	}

}
