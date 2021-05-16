package com.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
     private int dep_Id;
     private String dep_Name;
     
     
     
	public int getDep_Id() {
		return dep_Id;
	}
	public void setDep_Id(int dep_Id) {
		this.dep_Id = dep_Id;
	}
	public String getDep_Name() {
		return dep_Name;
	}
	public void setDep_Name(String dep_Name) {
		this.dep_Name = dep_Name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int dep_Id, String dep_Name) {
		super();
		this.dep_Id = dep_Id;
		this.dep_Name = dep_Name;
	}
     
}
