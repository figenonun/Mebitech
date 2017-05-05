package com.figenonun.company.dao_impl;

import org.springframework.stereotype.Repository;

import com.figenonun.company.dao.EmployeeDao;
import com.figenonun.company.models.Employee;

@Repository
public class EmployeeDaoImpl extends GenericDAOImpl<Employee> implements EmployeeDao {
	public EmployeeDaoImpl() {
		this.setClazz(Employee.class);
	}
}
