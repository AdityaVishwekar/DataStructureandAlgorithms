package com.code.sorting.divideandconquer;

import java.util.Scanner;
/*
 * Best Case Complexity:- O(n*logn)
 * Worst Case Complexity:- O(n^2)
 */
public class QuickSort {
	static int[] x;
	
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		x = new int[n];
		System.out.println("Enter elements to be sorted");
		for( i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		quickSort(x,0,n-1);
		
		System.out.println("Sorted elements are");
		for( i = 0; i < n; i++) {
			System.out.println(x[i]+" ");
		}
		
	}

	public static void quickSort(int[] x, int lb, int ub) {
		// TODO Auto-generated method stub
		int mid = 0;
		if(lb < ub) {
			mid = partition(x,lb,ub); // Get position of pivot
			quickSort(x,lb,mid-1); // Apply quickSort on Left side of pivot
			quickSort(x,mid+1,ub); // Apply quickSort on Right side of pivot
			
		}
		
	}
	
	// Sort the array according to pivot element and return position of pivot
	private static int partition(int[] x, int lb, int ub) {
		// TODO Auto-generated method stub
		// Initialize Pivot to the first element
		int pivot = x[lb];
		int up = ub; // Set counter for right side
		int down = lb; // Set counter for left side
		
		while( down < up) {
			// Compare pivot with down element
			while(x[down] <= pivot && down < ub) {
				down++;
			}
			// Compare pivot with up element
			while(x[up] > pivot) {
				up--;
			}
			// Check if the element on left side is greater than the pivot and element on right side is less than pivot
			if(down < up) {
				// Swap the elements
				int temp = x[down];
				x[down] = x[up];
				x[up] = temp;
			}
			
		}
		
		// Now, 'up' counter corresponds to position of pivot
		// Replace pivot with element at 'up' position
		
		x[lb] = x[up]; // Element at 'up' position becomes the lower bound
		x[up] = pivot; // Pivot is placed at correct position
		 
		return up; // Return position of recently placed element
	}

}
