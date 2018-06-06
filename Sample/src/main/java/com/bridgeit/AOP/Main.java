package com.bridgeit.AOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		/*Resource r=new ClassPathResource("/com/bridgeit/AOP/aop.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    A a=(A) factory.getBean("proxy");  
	    a.check();  */
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/bridgeit/AOP/aop.xml");
		A a=(A) context.getBean("proxy");  
	    a.check(); 
	    a.validate(12);
	}
}
