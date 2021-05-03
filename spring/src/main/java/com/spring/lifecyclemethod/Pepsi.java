package com.spring.lifecyclemethod;

public class Pepsi {
 private int cost;

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
	System.out.println("setter method");
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepsi [cost=" + cost + "]";
}
 
public void init() {
	System.out.println("init method");
	}
public void destroy() {
	System.out.println("destroy method");
	}
}
