package com.figenonun.company.dto;

import java.io.Serializable;
import java.util.List;

import com.figenonun.company.models.Employee;

public class DepartmentDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DepartmentDto() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private String description;
	private List <Employee> employees;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	
}
