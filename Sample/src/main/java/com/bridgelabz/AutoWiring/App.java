package com.bridgelabz.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("/com/bridgelabz/AutoWiring/autoWiring.xml");
    	B b = context.getBean("b",B.class);
    	b.print();
    }
}
