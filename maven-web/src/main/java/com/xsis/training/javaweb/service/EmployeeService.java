package com.xsis.training.javaweb.service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xsis.training.javaweb.dao.EmployeeDao;
import com.xsis.training.javaweb.dao.EmployeeDaoImpl;
import com.xsis.training.javaweb.dbconnect.DbUtils;
import com.xsis.training.javaweb.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public void save(Employee emp);
	public void delete(int parseInt);
	

}
