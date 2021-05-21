package com.Mappingmany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Assignment {
	@Id
      private int assignment_Id;
      private String assignment_Name;
      @ManyToMany
      private List<Student>students;
	public int getAssignment_Id() {
		return assignment_Id;
	}
	public void setAssignment_Id(int assignment_Id) {
		this.assignment_Id = assignment_Id;
	}
	public String getAssignment_Name() {
		return assignment_Name;
	}
	public void setAssignment_Name(String assignment_Name) {
		this.assignment_Name = assignment_Name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assignment(int assignment_Id, String assignment_Name, List<Student> students) {
		super();
		this.assignment_Id = assignment_Id;
		this.assignment_Name = assignment_Name;
		this.students = students;
	}
      
}
