package com.bridgeit.AOP;

public class A {
	
	public void check()
	{
		System.out.println("This is actual method");
	}
	public void validate(int age)
	{
		
		
	
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else {
			throw new IllegalArgumentException();
		}
	}

}
