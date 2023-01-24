//Program 4

package com.javaprograms;

import java.util.Scanner;

public class AverageArray 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);  
		System.out.print("How many array elements you want to enter: ");  
		int n = sc.nextInt();  
		
		int[] arr = new int[n];  
		System.out.println("Enter the elements of the array: "); 
		
		for(int i = 0; i < n; i++)  
		{   
			arr[i] = sc.nextInt();  
		}  
		
	    double sum = 0.0;
	    double avg = 0.0;

	    for (int i = 0; i < arr.length; i++) 
	    {
	    	sum = sum + arr[i];
	    }

	    avg = sum/arr.length;

	    System.out.println("Average: " + avg );
	 }
}
