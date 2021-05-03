package com.spring.lifecyclemethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apppop {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecyclemethod/config.xml");
	Popcorn pop= (Popcorn)context.getBean("price");
	Pepsi pep=(Pepsi) context.getBean("cost");
	Icecream ice=(Icecream) context.getBean("flavour");
	System.out.println(pop);
	System.out.println(ice);
	System.out.println(pep);
	context.registerShutdownHook();
}
}
