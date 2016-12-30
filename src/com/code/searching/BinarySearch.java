package com.code.searching;

import java.util.Scanner;
/*
 * Best Searching Algorithm
 * Time Complexit :- O(logn)
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,n = 0;
		System.out.println("Enter total number of elements");
		n = sc.nextInt();
		int input[] = new int[n];
		System.out.println("Enter "+n+" elements in ascending order");
		for(i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		int keyPosition = binarySearch(input,key,0,n-1);
		if(i == -1)
			System.out.println("Key not present in the array");
		else
			System.out.println(key+" is present on "+keyPosition+" of input array");
	}

	private static int binarySearch(int[] input, int key, int low, int high) {
		// TODO Auto-generated method stub
		if(low > high)
			return -1;
		// Find the middle position
		int mid = (low+high)/2;
		// Compare key with middle element
		if(input[mid] == key)
			return mid;
		else if(key < input[mid])
			return binarySearch(input,key,low,mid-1); // Key is present on right side of middle element
		else
			return binarySearch(input,key,mid+1,high); // Key is present on left side of middle element
	}

}
