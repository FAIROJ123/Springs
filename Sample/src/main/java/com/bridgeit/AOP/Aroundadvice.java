package com.bridgeit.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Aroundadvice implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj;
		System.out.println("Excuted before the actual method");
		obj=mi.proceed();
		return obj;
	}
	

}
