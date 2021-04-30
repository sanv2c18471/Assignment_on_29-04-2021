package com.spring.collections;

import java.util.*;

public class Student1 {
	private int id;
	private List<String> parents;
	private Set<String> phones;
	private Map<String, String> subject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getParents() {
		return parents;
	}

	public void setParents(List<String> parents) {
		this.parents = parents;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getSubject() {
		return subject;
	}

	public void setSubject(Map<String, String> subject) {
		this.subject = subject;
	}

	public Student1(int id, List<String> parents, Set<String> phones, Map<String, String> subject) {
		super();
		this.id = id;
		this.parents = parents;
		this.phones = phones;
		this.subject = subject;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", parents=" + parents + ", phones=" + phones + ", subject=" + subject + "]";
	}
}
