//Program 29

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
		System.out.println("Child method");
	}
}

class Prog29 
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.display();
		Child c = new Child();
		c.display();
	}
}