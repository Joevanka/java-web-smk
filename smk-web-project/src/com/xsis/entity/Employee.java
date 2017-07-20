package com.xsis.entity;

public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int id, String name, String address, String noHp, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.noHp = noHp;
	}



	private int id;
	private String name;
	private String address;
	private Double salary;
	private String noHp;
	
	
	
	
	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public String getNoHp() {
		return noHp;
	}



	public void setNoHp(String noHp) {
		this.noHp = noHp;
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
	
	
}
