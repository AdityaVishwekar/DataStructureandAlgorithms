package com.code.recursion;

import java.io.*;
/*
 * Time Complexity :- 0(n) - Best T(n) = T(n-1)+1
 */

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int factorial = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to find factorial");
		int n = Integer.parseInt(br.readLine());
		factorial = factorial(n);
		System.out.println("Factorial of "+n+" is "+factorial);

	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 1;
		} else 
			return (n*factorial(n-1));
	}

}
