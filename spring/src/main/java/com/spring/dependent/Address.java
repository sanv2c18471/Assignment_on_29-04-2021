package com.spring.dependent;

public class Address {
	private String Street;
    private String city;
    private int pincode;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
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
	public Address(String street, String city, int pincode) {
		super();
		Street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
