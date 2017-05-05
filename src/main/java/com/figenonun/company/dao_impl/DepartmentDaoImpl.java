package com.figenonun.company.dao_impl;

import org.springframework.stereotype.Repository;

import com.figenonun.company.dao.DepartmentDao;
import com.figenonun.company.models.Department;

@Repository
public class DepartmentDaoImpl extends GenericDAOImpl<Department> implements DepartmentDao{
	
	
	public DepartmentDaoImpl() {
		this.setClazz(Department.class);
	}
	 
}
