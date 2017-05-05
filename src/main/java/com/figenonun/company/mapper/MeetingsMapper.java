package com.figenonun.company.mapper;

import java.util.ArrayList;
import java.util.List;
import com.figenonun.company.dto.MeetingsDto;
import com.figenonun.company.models.Meetings;

public class MeetingsMapper {
	public static MeetingsDto modelToDto(Meetings model) {
		if (model == null) {
			return null;
		}
		MeetingsDto dto = new MeetingsDto();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setDescription(model.getDescription());
		dto.setDepartments(model.getDepart());
		return dto;
	}

	public static Meetings dtoToModel(MeetingsDto dto) {
		if (dto == null) {
			return null;
		}
		Meetings model = new Meetings();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setDescription(dto.getDescription());
		model.setDepart(dto.getDepartments());
		return model;
	}

	public static List<MeetingsDto> modelToDtoList(List<Meetings> modelList) {
		if (modelList == null) {
			return null;
		}
		List<MeetingsDto> dtoList = new ArrayList<MeetingsDto>();
		for (Meetings model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<Meetings> dtoToModelList(List<MeetingsDto> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<Meetings> modelList = new ArrayList<Meetings>();
		for (MeetingsDto dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}
}
