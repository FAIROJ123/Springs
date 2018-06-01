package com.bridgeit.InheritBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.ConstructorDependentObject.Person;

public class Test2 {
	public static void main(String[] args) {
		

	Resource res = new ClassPathResource("/com/bridgeit/InheritBean/inheritBean.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	
	Person per = (Person)factory.getBean("person2");
	System.out.println(per);
	}
	
}
