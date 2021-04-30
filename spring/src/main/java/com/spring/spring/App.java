package com.spring.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/spring/config.xml");
            Student ST=(Student)context.getBean("Student1");
                System.out.println(ST);
            }
        }
     
