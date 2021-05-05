package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appautowire {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/autowiring/configauto.xml");
	Student stu= (Student)context.getBean("student");
	//System.out.println(stu);
	System.out.println(stu.hashCode());
	
	//Student stu = context.getBean("student", Student.class);
	//System.out.println(stu);
	
	Student stu1= (Student)context.getBean("student");
	System.out.println(stu1.hashCode());
}
}
