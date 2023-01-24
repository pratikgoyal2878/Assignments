//Program 25

package com.javaprograms;

interface Demo
{
	public abstract void display();
}

class Prog25 implements Demo
{
	public void display()
	{
		System.out.println("Hello");		
	}
	
	public static void main(String args[])
	{
		Prog25 obj = new Prog25();
		obj.display();
	}
	
}
