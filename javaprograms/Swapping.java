//Program 20

package com.javaprograms;

import java.util.Scanner;

public class Swapping 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first No.:");
		int m = sc.nextInt();
		System.out.println("Enter second No.:");
		int n = sc.nextInt();
		
		int temp = m;
        m = n;
        n = temp;
        System.out.println("After swapping first No. is " + m + " and second No. is " + n);
	}
}
