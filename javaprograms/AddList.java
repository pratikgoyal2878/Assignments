//Program 10

package com.javaprograms;

import java.util.ArrayList;

public class AddList
{
   public static void main(String args[])
   {
	   
	   ArrayList<String> list1 = new ArrayList<String>();
	   list1.add("Apple");
       list1.add("Orange");
       list1.add("Banana");
       System.out.println("Contents of list1 ::"+list1);

       ArrayList<String> list2 = new ArrayList<String>();
       list2.add("Grapes");
       list2.add("Mango");
       list2.add("Strawberry");
       System.out.println("Contents of list2 ::"+list2);

       list1.addAll(list2);
       System.out.println("Contents of list1 after adding list2 to it ::"+list1);
   }
}
