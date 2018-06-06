package com.bridgeit.Scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prototype {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/bridgeit/Scopes/prototype.xml");
		
		HelloWorld obj1 = (HelloWorld)context.getBean("helloWorld");
	    obj1.setMessage("I am obj1");
	    obj1.getMessage();
	    
	    HelloWorld obj2 = (HelloWorld)context.getBean("helloWorld");
	    
	    obj2.getMessage();
	    
	}
	
}
