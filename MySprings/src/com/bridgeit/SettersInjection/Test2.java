package com.bridgeit.SettersInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.ConstructorDependentObject.Person;

public class Test2 {
public static void main(String[] args) {
	Resource res = new ClassPathResource("/com/bridgeit/SettersInjection/dependentObject.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	
	Person per = (Person)factory.getBean("per");
	System.out.println(per);
	
}
}
