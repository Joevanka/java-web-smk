package com.xsis.training.javaweb.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsis.training.javaweb.dbconnect.DbUtils;
import com.xsis.training.javaweb.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection conn = DbUtils.getConnect();
	private static final String DELETE = "DELETE FROM XSIS_EMPLOYEE where ID = ?";
	private static final String SQL_SAVE = "INSERT INTO XSIS_EMPLOYEE "
			+ "(id, name, address,salary, nohp) "
			+ "	values (xsis_seq.nextval, ?, ?, ?, ?)"; //JAVA CONSTANTA
	
	private static final String SQL_GETALLEMPLOYEE = "SELECT * FROM XSIS_EMPLOYEE";
	
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		PreparedStatement ps = 
				DbUtils.getPreparedStatement(SQL_SAVE, conn);
		
		
		try {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getNoHp());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		PreparedStatement ps = 
				DbUtils.getPreparedStatement(DELETE, conn);
		try {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee searchEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> listEmp = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = DbUtils.getPreparedStatement(SQL_GETALLEMPLOYEE, conn);
			rs = ps.executeQuery();
			while(rs.next()){
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setNoHp(rs.getString("nohp"));
				listEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listEmp;
	}

}
