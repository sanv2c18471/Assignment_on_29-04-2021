package com.HQLquery;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
@Id
	private int id;
	private String name;
	private String city;
	@OneToMany(mappedBy ="person")
	private List<AccountNumber>accountnumbers;
	
	
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
	public List<AccountNumber> getAccountnumbers() {
		return accountnumbers;
	}
	public void setAccountnumbers(List<AccountNumber> accountnumbers) {
		this.accountnumbers = accountnumbers;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String city, List<AccountNumber> accountnumbers) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.accountnumbers = accountnumbers;
	}
	
}
