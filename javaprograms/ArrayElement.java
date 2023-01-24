//Program 8

package com.javaprograms;

import java.util.Scanner;

public class ArrayElement 
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
		
		System.out.println("Enter the search value: ");
		int key = sc.nextInt();
		int flag = 0;
		
		for(int i = 0; i <= n - 1; i++)
		{
			if(arr[i] == key)
			{
				flag = 1;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
	}

}
