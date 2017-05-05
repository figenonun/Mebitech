package com.figenonun.company.dao;

import java.util.List;

public interface GenericDAO<T> {

	public T findOne(long id);

	public T findOne(int id);
	
	public T findOne(short id);

	public List<T> findAll();

	public void create(T entity);

	public T update(T entity);

	public void delete(T entity);

	public void deleteById(long id);

	public void deleteById(short id);
	
	public void deleteById(int id);

	public int getRowCount();
}