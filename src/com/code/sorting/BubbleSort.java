package com.code.sorting;
import java.util.Scanner;
/*
 * Time Complexity :- 0(n^2)- Worst
 */
public class BubbleSort {
	
	public static void main(String args[]) {
		Scanner sc;
		int i = 0;
		int n = 0;
		
		sc = new Scanner(System.in);
		System.out.println("Enter number of elements to be sorted");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements to be sorted");
		for(i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		bubbleSort(a);
		System.out.println("Element Sorted in Ascending order:");
		for(i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		
		int temp = 0;
		int i = 0;
		int j = 0;
		boolean flag = true;
		int n = a.length-1;
		for( i = 0; i < n && flag == true; i++) {
			flag = false;
			for( j = 0; j < n-i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
		}
		
		
	}

}
