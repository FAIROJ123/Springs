package com.bridgeit.SettersInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.ConstructorInjection.Employee;

public class Test {
public static void main(String[] args) {
	Resource res = new ClassPathResource("/com/bridgeit/SettersInjection/primitiveInjection.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	
	Employee emp = (Employee)factory.getBean("empl");
	System.out.println(emp);
}
}
