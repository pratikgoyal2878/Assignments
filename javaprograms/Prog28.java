//Program 28

package com.javaprograms;

interface Interface1 
{ 
    void f1(); 
} 

 
interface Interface2 
{ 	
    void f2(); 
} 

class Fun implements Interface1,Interface2 
{
	public void f1() 
    {	
		System.out.println("Method of Interface1"); 
    } 
  
    public void f2() 
    { 
        System.out.println("Method of Interface2") ; 
    } 
       
    public void f3() 
    { 
        System.out.println("Method of Class Fun"); 
    } 
} 

	class Prog28 
	{ 
		public static void main(String[] args) 
		{
			

			Interface1 i1;
			i1 = new Fun();
			i1.f1(); 

			Interface2 i2;
			i2 = new Fun();    
			i2.f2(); 
			
			Fun t = new Fun(); 
			t.f3(); 
     } 
} 


