package com.xsis.training.javaweb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sun.org.apache.xerces.internal.util.Status;
import com.xsis.training.javaweb.entity.Employee;
import com.xsis.training.javaweb.service.EmployeeService;
import com.xsis.training.javaweb.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeControler {

	EmployeeService employeeService = new EmployeeServiceImpl();
	
	@RequestMapping
	public String index(Model model){
		List<Employee> listEmployee = employeeService.getAllEmployee();
		model.addAttribute("listEmployee", listEmployee);
		
		return "employee"; //jsp
	}
	
	@ResponseBody
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(@ModelAttribute("Employee") Employee employee){
		
		return "OK";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute Employee employee){
		employeeService.save(employee);
		return "redirect:/employee"; //as content
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String delete(@PathVariable int id){
		employeeService.delete(id);
		return "redirect:/employee"; //as content
	}
}
