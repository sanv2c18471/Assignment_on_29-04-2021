package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppStud {
	public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/collections/configstud1.xml");
        Student1 stud1=(Student1)context.getBean("Stud");
        System.out.println(stud1.getId());
        System.out.println(stud1.getParents());
        System.out.println(stud1.getPhones());
        System.out.println(stud1.getSubject());
    }
}
