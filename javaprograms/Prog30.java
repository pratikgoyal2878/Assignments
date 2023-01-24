//Program 30

package com.javaprograms;

class Parent
{
	void display()
	{
		System.out.println("Parent method");
	}
	
}

class Child extends Parent
{
	void display()
	{
		super.display();
		System.out.println("Child method");
	}
}

class Prog30
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.display();
	}
}