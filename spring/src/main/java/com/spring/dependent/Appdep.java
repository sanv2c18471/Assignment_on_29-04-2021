package com.spring.dependent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Appdep {
public static void main(String[] args) {
	 ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/dependent/configemp.xml");
     Empdetails temp=(Empdetails) context.getBean("Empdetailsref");
     System.out.println(temp.getEmpId());
     System.out.println(temp.getEmpName());
     System.out.println(temp.getEmpAddress().getCity());
     System.out.println(temp.getEmpAddress().getStreet());
     System.out.println(temp.getEmpAddress().getPincode());
     System.out.println(temp);
}
}
