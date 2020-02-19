package com.cg.iter.lab1;

import java.util.Scanner;

public class SumTest {
	 static int CalculateSum(int n) 
	    { 
	        int sum = 0; 
	        for (int i = 1; i <= n; i++)  {
	        	
	        if(i%3==0 || i%5==0) {
	            sum = sum + i; 
	    } 
	        
	        }
			return sum;
			
}
	public static void main(String[] args) {
		
	        int n; 
	        System.out.println("Enter the value of n:");
	        Scanner Scan = new Scanner(System.in);
	        n=Scan.nextInt();
	        System.out.println(CalculateSum(n)); 
	    }  

	}
