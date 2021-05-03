package com.spring.autowiring;

public class Address {
 private String  city;
 private  int pincode;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [city=" + city + ", pincode=" + pincode + "]";
}
 
}
