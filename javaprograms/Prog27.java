//Program 27

package com.javaprograms;

class Test1
{
	public void display1()
	{
		System.out.println("Parent class method");
	}
}

class Demo1 extends Test1
{
	public void display2()
	{
		System.out.println("Child class method");
	}
}

class Prog27
{
	public static void main(String args[])
	{
		Test1 t1 = new Test1();
		t1.display1();
		t1 = new Demo1();
		((Demo1) t1).display2();
	}
}