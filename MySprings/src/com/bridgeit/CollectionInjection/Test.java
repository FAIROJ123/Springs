package com.bridgeit.CollectionInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource res = new ClassPathResource("/com/bridgeit/CollectionInjection/listInjection.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	
	Employee emp = (Employee)factory.getBean("Employee");
	emp.dislay();
}
}
