package com.figenonun.company.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.figenonun.company.dto.EmployeeDto;
import com.figenonun.company.dto.MeetingsDto;
import com.figenonun.company.service.MeetingsService;
@RestController
public class MeetingsController {
	@Autowired
	private MeetingsService service;
	
	@RequestMapping(value="/meetings", method= RequestMethod.GET)
	public List<MeetingsDto> getMeetings(){
	
		return service.getMeetingsAll();
	}
	@RequestMapping(value="/meetings/post", method= RequestMethod.POST, produces = "application/json")
	public String postMeetings( @RequestBody MeetingsDto meetings){
			System.out.println(meetings.getName());
			service.addMeetings(meetings);
		return "200";
	}
	@RequestMapping(value="/meetings/put", method= RequestMethod.PUT, produces = "application/json")
	public String putMeetings( @RequestBody MeetingsDto meetings,MeetingsDto meetingsDto){
		meetingsDto=service.findMeetingsWithID(meetings.getId());
			System.out.println(meetingsDto.getName());
			service.updateMeetings(meetings);
		return "200";
	}
	@RequestMapping(value="/meetings/delete", method= RequestMethod.DELETE, produces = "application/json")
	public void deleteMeetings( @RequestBody MeetingsDto meetings,MeetingsDto meetingsDto){
		meetingsDto=service.findMeetingsWithID(meetings.getId());
		System.out.println(meetingsDto.getName());
			service.deleteMeetings(meetingsDto.getId());
	}
}
