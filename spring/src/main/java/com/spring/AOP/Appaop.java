package com.spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appaop {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/AOP/configaop.xml");
	//PaymentserviceImpl payment = (PaymentserviceImpl)context.getBean("pay");
	//payment.makePayment();
	
	Paymentservice payment1 = (Paymentservice)context.getBean("pay");
	payment1.makePayment();
}
}
