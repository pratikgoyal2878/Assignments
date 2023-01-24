//Program 5

package com.javaprograms;

import java.util.Scanner;

public class AddMatrix
{
	public static void main(String args[])
	{
		int m, n, i, j;   
		Scanner sc = new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		m = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		n = sc.nextInt();    
		int arr1[][] = new int[m][n];    
		System.out.println("Enter the elements of the array: ");   
		
		for (i = 0; i < m; i++)  
		{
			for (j = 0; j < n; j++)   
			{
				arr1[i][j] = sc.nextInt();
			}		 
		}
		
		
		int x, y, p, q;   
		System.out.print("Enter the number of rows: "); 
		x = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		 
		y = sc.nextInt();   
		
		int arr2[][] = new int[x][y];   
		  
		System.out.println("Enter the elements of the array: ");   
		
		for (p = 0; p < x; p++)
		{
			for (q = 0; q < n; q++)
			{
				arr2[p][q] = sc.nextInt();
			}
		}
		   
		   
		  
		
		System.out.println("Matrix 1");
		for( i=0;i<m;i++)
		{    
			for( j=0;j<n;j++)
			{    
				System.out.print(arr1[i][j]+" ");    
			}    
			System.out.println();//new line    
		}
	
		System.out.println("Matrix 2");
		for( i=0;i<x;i++)
		{    
			for( j=0;j<y;j++)
			{    
	 
				System.out.print(arr2[i][j]+" ");    
			}    
			System.out.println();//new line    
		}
		System.out.println("Added matrix:");
	   
		int sum[][]=new int[m][n]; 
		for( i=0;i<m;i++)
		{    
			for( j=0;j<n;j++)
			{    
				sum[i][j] = arr1[i][j] + arr2[i][j];    
				System.out.print(sum[i][j]+" ");    
			}    
			System.out.println();    
		}    
	}
}
