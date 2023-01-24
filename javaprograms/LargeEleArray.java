//Program 9

package com.javaprograms;

import java.util.Scanner;

public class LargeEleArray 
{
	public static void main(String args[])
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
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Largest element of the array is: "+ max);           
	}
}
