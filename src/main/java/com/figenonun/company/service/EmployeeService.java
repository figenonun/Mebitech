package com.figenonun.company.service;

import java.util.List;

import com.figenonun.company.dto.EmployeeDto;

public interface EmployeeService {
	public void addEmployee(EmployeeDto employe);

	public void updateEmploye(EmployeeDto employe);

	public void deleteEmploye(int employeId);

	public List<EmployeeDto> getEmployeesAll();
	
	public EmployeeDto findEmployeeWithID(int id);

	public int getEmployeeRowCount();
}
