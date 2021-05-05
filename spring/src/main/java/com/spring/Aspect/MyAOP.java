package com.spring.Aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class MyAOP {
	@Aspect
	public class MyAspect {
	    @Before("execution(* com.spring.Aspect.SigninserviceImpl.makeSignin())")
		   public void printBefore() {
			  System.out.println("User Signin started");
	    }
			  @After("execution(* com.spring.Aspect.SigninserviceImpl.makeSignin())")
			   public void printAfter() {
				  System.out.println("User Signin sucessfully");
		}
	}
}
