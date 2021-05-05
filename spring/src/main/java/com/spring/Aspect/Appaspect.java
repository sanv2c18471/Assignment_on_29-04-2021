package com.spring.Aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appaspect {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Aspect/configaspect.xml");
		//SigninserviceImpl signin = (SigninserviceImpl)context.getBean("sign");
		//signin.makePayment();
		
		Signinservice signin = (Signinservice)context.getBean("sign");
		signin.makeSignin();
	}
}
