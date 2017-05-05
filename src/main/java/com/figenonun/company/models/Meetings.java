package com.figenonun.company.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="meetings")
public class Meetings {
	
	public Meetings() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	@OneToMany(targetEntity=Department.class, fetch=FetchType.LAZY)
	@Column(name="depart")
	private List <Department> depart;
	
	
	public String getName() {
		return name;
	}
	
	public List<Department> getDepart() {
		return depart;
	}

	public void setDepart(List<Department> depart) {
		this.depart = depart;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
