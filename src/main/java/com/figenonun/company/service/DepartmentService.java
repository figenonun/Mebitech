package com.figenonun.company.service;

import java.util.List;

import com.figenonun.company.dto.DepartmentDto;

public interface DepartmentService {
	public void addDepartment(DepartmentDto department);

	public void updateDepartment(DepartmentDto department);

	public void deleteDepartment(int departmentId);

	public List<DepartmentDto> getDepartmentsAll();
	
	public DepartmentDto findDepartmentWithID(int id);

	public int getDepartmentsRowCount();

}
