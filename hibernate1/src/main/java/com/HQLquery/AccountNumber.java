package com.HQLquery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AccountNumber {
	@Id
  private long accountNo;
  private String bankName;
  @ManyToOne
  private Person person;
  
public AccountNumber() {
	super();
	// TODO Auto-generated constructor stub
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
public AccountNumber(long accountNo, String bankName, Person person) {
	super();
	this.accountNo = accountNo;
	this.bankName = bankName;
	this.person = person;
}
  
  
  
}
