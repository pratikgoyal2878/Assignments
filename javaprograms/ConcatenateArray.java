//Program 6

package com.javaprograms;

import java.util.Scanner;

public class ConcatenateArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		System.out.print("How many array elements you want to enter in first array: ");  
		int m = sc.nextInt();  
		
		int[] arr1 = new int[m];  
		System.out.println("Enter the elements of first array: "); 
		
		for(int i = 0; i < m; i++)  
		{   
			arr1[i] = sc.nextInt();  
		}  
		 
		System.out.print("How many array elements you want to enter in second array: ");  
		int n = sc.nextInt();  
		
		int[] arr2 = new int[n];  
		System.out.println("Enter the elements of second array: "); 
		
		for(int i = 0; i < n; i++)  
		{   
			arr2[i] = sc.nextInt();  
		}  
		
		
	    int[] arr3 = new int[arr1.length+arr2.length];
	    int count = 0;
	    for(int i = 0; i<arr1.length; i++) 
	    {
	        arr3[i] = arr1[i];
	        count++;
	    }
	    
	    for(int j = 0;j<arr2.length;j++)
	    {
	        arr3[count++] = arr2[j];
	    }
	    
	    System.out.println("Concatenation of two array:");
	    System.out.print("[ ");
	    for(int i = 0;i<arr3.length;i++)
	    {
	    	System.out.print(arr3[i]+" ");
	    }
	    System.out.print("]");
	}
}
