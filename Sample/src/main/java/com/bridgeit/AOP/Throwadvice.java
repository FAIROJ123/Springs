package com.bridgeit.AOP;

import org.springframework.aop.ThrowsAdvice;

public class Throwadvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException ex){  
        System.out.println("if any exception is occur then it will print this");  
    
    
	}
}
