package com.figenonun.company.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.figenonun.company.dao.DepartmentDao;
import com.figenonun.company.dto.DepartmentDto;
import com.figenonun.company.mapper.DepartmentMapper;
import com.figenonun.company.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao service;
	@Override
	public void addDepartment(DepartmentDto department) {
		service.create(DepartmentMapper.dtoToModel(department));
		
	}

	@Override
	public void updateDepartment(DepartmentDto department) {
		service.update(DepartmentMapper.dtoToModel(department));
		
	}

	@Override
	public void deleteDepartment(int departmentId) {
	 service.deleteById(departmentId);
		
	}

	@Override
	public List<DepartmentDto> getDepartmentsAll() {

		return DepartmentMapper.modelToDtoList(service.findAll());
	}

	@Override
	public DepartmentDto findDepartmentWithID(int id) {
		return DepartmentMapper.modelToDto(service.findOne(id));
	}

	@Override
	public int getDepartmentsRowCount() {
		service.getRowCount();
		return 0;
	}

}
