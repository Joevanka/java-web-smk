package com.xsis.training.smkjavaweb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.training.smkjavaweb.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Employee e) {
		// TODO Auto-generated method stub
	  Session session = sessionFactory.getCurrentSession();
	  session.save(e);
	  session.flush();
	}

	public void update(int id, Employee e) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Employee> list = 
					session.createCriteria(Employee.class).list();
		 
		return list;
	}

}
