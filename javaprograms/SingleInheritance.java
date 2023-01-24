//Program 26

package com.javaprograms;

class Test
{
	public void display1()
	{
		System.out.println("Parent class method");
	}
}

class SingleInheritance extends Test
{
	public void display2()
	{
		System.out.println("Child class method");
	}
	
	public static void main(String args[])
	{
		SingleInheritance obj = new SingleInheritance();
		obj.display1();
		obj.display2();
	}
}