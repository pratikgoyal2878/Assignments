//Program 11

package com.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrConvert
{	
    public static void main(String[] args) 
    {
          
        List<String> l1 = new ArrayList<>();  
        l1.add("Mango");  
        l1.add("Banana");  
        l1.add("Apple");  
        l1.add("Strawberry");  
        l1.add("Pineapple");  
        
        System.out.println("Converting ArrayList to Array" ); 
        
        String[] item = l1.toArray(new String[l1.size()]);  
        for(String s : item)
        {  
            System.out.println(s);  
        }  
        
        System.out.println("Converting Array to ArrayList" );
        
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(item);  
        System.out.println(l2);  
    }  
}  
