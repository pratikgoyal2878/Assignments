//Program 24

package com.javaprograms;

import java.io.*;
import java.util.Scanner;

public class ReverseSen 
{
	public static String reverse_sentence(String str)
	{
		if (str.isEmpty())
		{
			return str;
		}	
		else 
		{
			char ch = str.charAt(0);
		
			return reverse_sentence(str.substring(1)) + ch;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();

		String rev_str = reverse_sentence(str);
		
		System.out.println("Sentence in reversed form is : " + rev_str);
	}
}

