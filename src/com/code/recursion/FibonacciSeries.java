package com.code.recursion;
/*
 * 1, 1, 2, 3, 5, 8,..
 * Time Complexity : O(2^n)
 */

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'n' in fibonacci series");
		int n = sc.nextInt();
		int nthElement = fibonacci(n);
		System.out.println("The "+n+"th element in fibonacci series is "+nthElement);
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		if( n == 1 || n == 2)
			return 1;
		else
			return (fibonacci(n-1)+fibonacci(n-2));
	}

}
