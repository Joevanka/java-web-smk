package com.xsis.training.smkjavaweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xsis_employee")
public class Employee {
	
	public Employee(){}
	
	public Employee(String email, int id, String name, String address, Double salary) {
		super();
		this.email = email;
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Id //primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //auto increment
	private int id;
	@Column(name="name", nullable = false)
	private String name;
	@Column(name="email", unique = true)
	private String email;
	private String address;
	private Double salary;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
