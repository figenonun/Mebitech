package com.figenonun.company.dao_impl;

import org.springframework.stereotype.Repository;

import com.figenonun.company.dao.MeetingsDao;
import com.figenonun.company.models.Meetings;

@Repository
public class MeetingsDaoImpl extends GenericDAOImpl<Meetings> implements MeetingsDao {
	public MeetingsDaoImpl() {
		this.setClazz(Meetings.class);
	}
}
