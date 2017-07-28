package com.xsis.training.javaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/home")
public class Home {

	@RequestMapping
	public String loadJsp(){
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String save(){
		
		return "this page will save..";
	}
}
