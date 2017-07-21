package com.xsis.service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xsis.dao.EmployeeDao;
import com.xsis.dao.EmployeeDaoImpl;
import com.xsis.dbconnect.DbUtils;
import com.xsis.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public void save(Employee emp);
	public void delete(int parseInt);
	

}
