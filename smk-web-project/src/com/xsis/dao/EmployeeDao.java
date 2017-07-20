package com.xsis.dao;

import java.util.List;

import com.xsis.entity.Employee;

//definisi DAO
public interface EmployeeDao {

	//insert
	public void save(Employee emp);
	
	//update
	public void update(int id, Employee emp);
	
	//delete
	public void delete(int id);
	
	//search 
	public List<Employee> getEmployeeByName(String name);
	
	//get All Employee
	public List<Employee> getAllEmployee();
	
	//seach by email
	public Employee searchEmployeeByEmail(String email);
	
}
