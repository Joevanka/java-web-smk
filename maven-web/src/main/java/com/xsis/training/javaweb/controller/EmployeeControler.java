package com.xsis.training.javaweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sun.org.apache.xerces.internal.util.Status;

@Controller
@RequestMapping("/employee")
public class EmployeeControler {

	@RequestMapping
	public String index(){
		return "index"; // as get index.jsp file
	}
	
	@ResponseBody
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String save(HttpServletRequest request){
		String name = request.getParameter("username");
		return name;
	}
	

	@ResponseBody
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String delete(@PathVariable int id){
		return "id delete "+ id; //as content
	}
}
