package com.figenonun.company.mapper;

import java.util.ArrayList;
import java.util.List;

import com.figenonun.company.dto.DepartmentDto;
import com.figenonun.company.models.Department;

public class DepartmentMapper {
	public static DepartmentDto modelToDto(Department model) {
		if (model == null) {
			return null;
		}
		DepartmentDto dto = new DepartmentDto();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setDescription(model.getDescription());
		dto.setEmployees(model.getEmployees());
		return dto;
	}

	public static Department dtoToModel(DepartmentDto dto) {
		if (dto == null) {
			return null;
		}
		Department model = new Department();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setDescription(dto.getDescription());
		model.setEmployees(dto.getEmployees());
		return model;
	}

	public static List<DepartmentDto> modelToDtoList(List<Department> modelList) {
		if (modelList == null) {
			return null;
		}
		List<DepartmentDto> dtoList = new ArrayList<DepartmentDto>();
		for (Department model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<Department> dtoToModelList(List<DepartmentDto> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<Department> modelList = new ArrayList<Department>();
		for (DepartmentDto dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}
}
