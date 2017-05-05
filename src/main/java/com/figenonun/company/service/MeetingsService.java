package com.figenonun.company.service;

import java.util.List;

import com.figenonun.company.dto.MeetingsDto;

public interface MeetingsService {
	public void addMeetings(MeetingsDto meetings);

	public void updateMeetings(MeetingsDto meetings);

	public void deleteMeetings(int meetingsId);

	public List<MeetingsDto> getMeetingsAll();
	
	public MeetingsDto findMeetingsWithID(int id);

	public int getMeetingsRowCount();
}
