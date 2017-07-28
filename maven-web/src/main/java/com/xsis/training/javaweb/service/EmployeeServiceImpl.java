package com.xsis.training.javaweb.service;

import java.util.List;

import com.xsis.training.javaweb.dao.EmployeeDao;
import com.xsis.training.javaweb.dao.EmployeeDaoImpl;
import com.xsis.training.javaweb.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	//get all employee
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}

	public void save(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.save(emp);
		
	}

	@Override
	public void delete(int parseInt) {
		// TODO Auto-generated method stub
		employeeDao.delete(parseInt);
		
	}
}
