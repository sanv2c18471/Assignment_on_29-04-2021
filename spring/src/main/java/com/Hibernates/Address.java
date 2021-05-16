package com.Hibernates;

import java.beans.Transient;
import java.util.Arrays;
import java.util.Date;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "student_address") //table name is student_address not Address
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressID;
    @Column(length = 50,name = "street_name")
    private String street;
    @Column(length = 100)
    private String city;
    @Column(name = "is_lockdown")
    private boolean isLockdown;
    @Temporal(TemporalType.DATE)
    private Date lockdownDate;
    @Lob
    private byte[] image;
    @javax.persistence.Transient
    private double price;
    
    public Address(int addressID, String street, String city, boolean isLockdown, Date lockdownDate, byte[] image,
            double price) {
        super();
        this.addressID = addressID;
        this.street = street;
        this.city = city;
        this.isLockdown = isLockdown;
        this.lockdownDate = lockdownDate;
        this.image = image;
        this.price = price;
    }
    public Address() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getAddressID() {
        return addressID;
    }
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public boolean isLockdown() {
        return isLockdown;
    }
    public void setLockdown(boolean isLockdown) {
        this.isLockdown = isLockdown;
    }
    public Date getLockdownDate() {
        return lockdownDate;
    }
    public void setLockdownDate(Date lockdownDate) {
        this.lockdownDate = lockdownDate;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", street=" + street + ", city=" + city + ", isLockdown="
				+ isLockdown + ", lockdownDate=" + lockdownDate + ", image=" + Arrays.toString(image) + ", price="
				+ price + "]";
	}
    
    
}
 