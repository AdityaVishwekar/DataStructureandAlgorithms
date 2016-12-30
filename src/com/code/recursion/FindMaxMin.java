package com.code.recursion;

import java.util.Scanner;

class LargeSmall {
	int max, min;
}
/*
 * Two objects created m and m1
 * 'm' will point towards max, min values
 * Time Complexity is O(n) - Best Algorithm
 */
public class FindMaxMin {
	static int i;
	static int x[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LargeSmall m = new LargeSmall();
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		x = new int[n];
		System.out.println("Enter elements");
		for( i = 0 ; i < n; i++ ) {
			x[i] = sc.nextInt();
		}
		minmax(0,n-1,m);
		// 'm' now points to max, min values
		System.out.println("Maximum value in the array is "+m.max);
		System.out.println("Minimum value in the array is "+m.min);
	}
	private static void minmax(int lb, int ub, LargeSmall m) {
		// TODO Auto-generated method stub
		int mid;
		LargeSmall m1 = new LargeSmall();
		
		// If there is only one element
		if( lb == ub) {
			m.min = x[lb];
			m.max = x[ub];
		}
		// If there are two elements
		else if ( lb == ub-1) {
			// Compare lb and ub
			if(x[lb] < x[ub]) {
				m.min = x[lb];
				m.max = x[ub];
			} else
				m.min = x[ub];
				m.max = x[lb];
		} else {
			// There are more than two elements
			mid = (lb + ub)/2;
			minmax(lb,mid,m); // Find min, max in half of an array
			minmax(mid+1,ub,m1); // Find min, max in other half of an array
			// Compare m-{max,min} and m1-{max,min} and 'MERGE' 
			if( m1.min < m.min) 
				m.min = m1.min;
			if( m1.max > m.max)
				m.max = m1.max;
			
		}
			
	}
}
