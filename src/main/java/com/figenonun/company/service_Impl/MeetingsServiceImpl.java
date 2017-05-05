package com.figenonun.company.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.figenonun.company.dao.MeetingsDao;
import com.figenonun.company.dto.MeetingsDto;
import com.figenonun.company.mapper.MeetingsMapper;
import com.figenonun.company.service.MeetingsService;


@Service
public class MeetingsServiceImpl implements MeetingsService{

	@Autowired
	private MeetingsDao service;
	
	@Override
	public void addMeetings(MeetingsDto meetings) {
		service.create(MeetingsMapper.dtoToModel(meetings));
		
	}

	@Override
	public void updateMeetings(MeetingsDto meetings) {
		service.update(MeetingsMapper.dtoToModel(meetings));
		
	}

	@Override
	public void deleteMeetings(int meetingsId) {
		service.deleteById(meetingsId);
		
	}

	@Override
	public List<MeetingsDto> getMeetingsAll() {
	
		return MeetingsMapper.modelToDtoList(service.findAll());
	}

	@Override
	public MeetingsDto findMeetingsWithID(int id) {
		return MeetingsMapper.modelToDto(service.findOne(id));
	}

	@Override
	public int getMeetingsRowCount() {
		service.getRowCount();
		return 0;
	}

}
