package com.bridgeit.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/com/bridgeit/ConstructorInjection/primitiveInjection.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee empl = (Employee)factory.getBean("emp");
		System.out.println(empl);
	}
	
}
