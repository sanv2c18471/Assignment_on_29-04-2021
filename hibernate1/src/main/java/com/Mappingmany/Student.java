package com.Mappingmany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
       private int student_Id;
       private  String student_Name;
       @ManyToMany
       private List<Assignment> assignments;
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public List<Assignment> getAssignments() {
		return assignments;
	}
	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_Id, String student_Name, List<Assignment> assignments) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.assignments = assignments;
	}
       
}
