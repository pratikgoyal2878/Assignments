//Program 7

package com.javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CharString 
{
	public static void ChartoString()
	{
		char ch = 'c';
        String str = Character.toString(ch);
        System.out.println("The string is: " + str);
	}
	
	public static void StringtoChar()
	{
		String st = "Capgemini";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
	}
	
	public static void main(String args[])
	{
		CharString.ChartoString();
		CharString.StringtoChar();
	}
}
