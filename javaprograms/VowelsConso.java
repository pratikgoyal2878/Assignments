//Program 18

package com.javaprograms;

import java.util.Scanner;

public class VowelsConso 
{    
    public static void main(String[] args) 
    {   
        int vowels = 0, consonants = 0;    
            
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter string:");
        String str = sc.nextLine(); 
                
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) 
        {      
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {      
                vowels++;    
            }       
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {          
                consonants++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowels);    
        System.out.println("Number of consonants: " + consonants);    
    }    
}   
