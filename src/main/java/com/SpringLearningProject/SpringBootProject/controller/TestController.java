package com.SpringLearningProject.SpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringLearningProject.SpringBootProject.dao.UserRepo;

@Controller
public class TestController {

	@Autowired
	private UserRepo user;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "home";
	}
}
