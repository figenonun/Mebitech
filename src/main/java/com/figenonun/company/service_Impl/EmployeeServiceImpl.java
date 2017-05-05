package com.figenonun.company.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.figenonun.company.dao.EmployeeDao;
import com.figenonun.company.dto.EmployeeDto;
import com.figenonun.company.mapper.EmployeeMapper;
import com.figenonun.company.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao service;
	
	@Override
	public void addEmployee(EmployeeDto employe) {
    service.create(EmployeeMapper.dtoToModel(employe));
		
	}

	@Override
	public void updateEmploye(EmployeeDto employe) {
		service.update(EmployeeMapper.dtoToModel(employe));
		
	}

	@Override
	public void deleteEmploye(int employeId) {
	service.deleteById(employeId);
		
	}

	@Override
	public List<EmployeeDto> getEmployeesAll() {
		return EmployeeMapper.modelToDtoList(service.findAll());
		
	}

	@Override
	public EmployeeDto findEmployeeWithID(int id) {
		return EmployeeMapper.modelToDto(service.findOne(id));

	}

	@Override
	public int getEmployeeRowCount() {
		
		service.getRowCount();
		return 0;
	}

}
