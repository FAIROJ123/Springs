package com.bridgelabz.AutoWiring;

public class B {
 A a;
 
 public B() {
	System.out.println("b is created.");
	}

public A getA() {
	return a;
}

public void setA(A a) {
	this.a = a;
}
public void display()
{
	System.out.println("Hello B class");
}
public void print()
{
display();
a.display();
}



}
