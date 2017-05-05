package com.figenonun.company.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable{
 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private String surname;
	private int salary ;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
