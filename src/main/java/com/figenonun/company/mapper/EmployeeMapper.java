package com.figenonun.company.mapper;

import java.util.ArrayList;
import java.util.List;
import com.figenonun.company.dto.EmployeeDto;
import com.figenonun.company.models.Employee;

public class EmployeeMapper {
	public static EmployeeDto modelToDto(Employee model) {
		if (model == null) {
			return null;
		}
		EmployeeDto dto = new EmployeeDto();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setSurname(model.getSurname());
		dto.setSalary(model.getSalary());
		return dto;
	}

	public static Employee dtoToModel(EmployeeDto dto) {
		if (dto == null) {
			return null;
		}
		Employee model = new Employee();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setSurname(dto.getSurname());
		model.setSalary(dto.getSalary());
		return model;
	}

	public static List<EmployeeDto> modelToDtoList(List<Employee> modelList) {
		if (modelList == null) {
			return null;
		}
		List<EmployeeDto> dtoList = new ArrayList<EmployeeDto>();
		for (Employee model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<Employee> dtoToModelList(List<EmployeeDto> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<Employee> modelList = new ArrayList<Employee>();
		for (EmployeeDto dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}
}
