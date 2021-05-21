package com.spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/beanscope/config.xml");
	Student student1= (Student)context.getBean("stud");
	System.out.println(student1.hashCode());
	System.out.println(student1);
	Student student2= (Student)context.getBean("stud");
	System.out.println(student2.hashCode());
	System.out.println(student2);
	
	Employee employee1= (Employee)context.getBean("emplo");
	System.out.println(employee1.hashCode());
	System.out.println(employee1);
	Employee employee2= (Employee)context.getBean("emplo");
	System.out.println(employee2.hashCode());
	System.out.println(employee2);
}
}
