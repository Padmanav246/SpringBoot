package com.SpringLearningProject.SpringBootProject.RestOperation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping(value = "/books",method = RequestMethod.GET)
	public String getBooks() {
		return "This is for book testing";
		
	}
}