package com.spring.lifecyclemethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Icecream {
 private String flavour;

public String getFlavour() {
	return flavour;
}

public void setFlavour(String flavour) {
	this.flavour = flavour;
}

public Icecream() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Icecream [flavour=" + flavour + "]";
}

@PostConstruct

 public void start() {
	 System.out.println("Annotation Init method");
 }

@PreDestroy
 public void end() {
	 System.out.println("Annotation Destroy method");
 }
}
