//Program 31

package com.javaprograms;

abstract class Base 
{
	abstract void fun();
	
	void display()
	{
		System.out.println("Base method");
	}
}

class Derived extends Base 
{
	void fun()
	{
		System.out.println("Derived method");
	}
}


class Prog31 
{
	public static void main(String args[])
	{		
		Base b = new Derived();
		b.fun();
		Derived d = new Derived();
		d.display();
	}
}
