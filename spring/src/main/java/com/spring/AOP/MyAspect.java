package com.spring.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* com.spring.AOP.PaymentserviceImpl.makePayment())")
	   public void printBefore() {
		  System.out.println("User Payment started");
    }
		  @After("execution(* com.spring.AOP.PaymentserviceImpl.makePayment())")
		   public void printAfter() {
			  System.out.println("User Payment sucessfully");
	}
}
