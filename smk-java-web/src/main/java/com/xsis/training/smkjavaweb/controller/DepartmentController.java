package com.xsis.training.smkjavaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.xsis.training.smkjavaweb.model.Department;
import com.xsis.training.smkjavaweb.service.DataMasterService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DataMasterService dataMasterService;
	
	@RequestMapping( value="/save", method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void save(@RequestBody Department department){
		dataMasterService.save(department);
	}

}
