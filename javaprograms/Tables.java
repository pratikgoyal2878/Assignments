//Program 16

package com.javaprograms;

import java.util.Scanner;

public class Tables 
{

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter No.:");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}