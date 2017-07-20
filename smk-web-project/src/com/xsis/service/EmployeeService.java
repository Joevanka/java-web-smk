package com.xsis.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xsis.dao.EmployeeDao;
import com.xsis.dao.EmployeeDaoImpl;
import com.xsis.dbconnect.DbUtils;
import com.xsis.entity.Employee;

public class EmployeeService {
	
	//polymorphism
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	//get all employee
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}

}
