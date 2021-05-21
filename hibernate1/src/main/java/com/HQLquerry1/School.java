package com.HQLquerry1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	@Id
     private int id;
     private String name;
     private String city;
     private Record record;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(int id, String name, String city, Record record) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.record = record;
	}
     
}
