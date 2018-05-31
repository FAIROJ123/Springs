package com.bridgeit.ConstructorDependentObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource res = new ClassPathResource("/com/bridgeit/ConstructorDependentObject/dependentObject.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	
	Person per = (Person)factory.getBean("person");
	System.out.println(per);
}
}
