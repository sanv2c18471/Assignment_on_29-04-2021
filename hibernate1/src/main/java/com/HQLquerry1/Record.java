package com.HQLquerry1;

import javax.persistence.Embeddable;

@Embeddable
public class Record {
  private String subject;
  private int marks;
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Record() {
	super();
	// TODO Auto-generated constructor stub
}
public Record(String subject, int marks) {
	super();
	this.subject = subject;
	this.marks = marks;
}
  
}
