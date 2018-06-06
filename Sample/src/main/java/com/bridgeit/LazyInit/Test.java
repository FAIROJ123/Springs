package com.bridgeit.LazyInit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		/*Resource res = new ClassPathResource("/com/bridgeit/LazyInit/lazyinit.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		
		Bean1 b1 = (Bean1)fac.getBean("bean1");
		Bean2 b2 = (Bean2)fac.getBean("bean2");*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/bridgeit/LazyInit/lazyinit.xml");
	}
}
