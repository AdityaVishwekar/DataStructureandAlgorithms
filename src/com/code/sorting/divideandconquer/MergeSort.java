package com.code.sorting.divideandconquer;

import java.util.Scanner;
/*
 * Time Complexity:- O(n*logn) - Best sorting algorithm if the data is more than 30 elements
 */
public class MergeSort {
	static int[] x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		x = new int[n];
		System.out.println("Enter elements to be sorted using MergeSort");
		for( i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		
		useMerge( x, 0, n-1);
		for( i = 0; i < n; i++) {
			System.out.println(x[i]);
		}

	}

	private static void useMerge(int[] x, int lb, int ub) {
		// TODO Auto-generated method stub
		int mid = 0;
		if( lb < ub) {
			mid = (lb+ub)/2;
			useMerge(x,lb,mid);
			useMerge(x,mid+1,ub);
			merge(x,lb,mid,ub);
		}
	}

	private static void merge(int[] x, int lb1, int ub1, int ub2) {
		// TODO Auto-generated method stub
		// First Array:- lb1->ub1(mid)
		// Second Array:-ub1+1(mid+1)->ub2
		int i = lb1;
		int j = ub1+1;
		int k = 0;
		int[] temp = new int[x.length];
		
		// Execute as long as there is data in file1 & file2
		// Compare elements present in first and second array and store the maximum in temporary array
		while( i <= ub1 && j <= ub2) {
			if ( x[i] > x[j])
				temp[k++] = x[i++];
			else
				temp[k++] = x[j++];
		}
		
		// Now, after comparison maximum of both the arrays are present in temp array
		// Transfer all the data from first array into temp array
		// Execute as long as there is data in first array
		while( i <= ub1) {
			temp[k++] = x[i++];
		}
		
		// Transfer all the data present from Second array into temp array
		// Execute as long as there is data in second array
		while( j <= ub2) {
			temp[k++] = x[j++];
		}
		j = 0;
		// Transfer all the data from temporary array to original array
		for(i=lb1; i <= ub2; i++) {
			x[i] = temp[j];
			j++;
		}
		
	}

}
