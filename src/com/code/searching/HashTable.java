package com.code.searching;

import java.util.Scanner;
/*
 * Fastest searching method
 * Time complexity:- O(n) less than binarySearch
 */

public class HashTable {
	static int i = 0;
	static int j = 0;
	static int[] hashTable = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i = 0;
		int[] input;
		System.out.println("Enter number of keys");
		n = sc.nextInt();
		input = new int[n];
		System.out.println("Enter keys");
		for( i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}

		System.out.println("Enter size of hash table");
		int size = sc.nextInt(); 
		createHashTable(input,size);
		System.out.println(" HashTable Data :-");
		for( i = 0; i < size; i++) {
			System.out.print(hashTable[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		j = searchHashTable(key,size);
		int position = j+1;
		System.out.println("Key->"+hashTable[j]+" found at position "+position);
	}

	private static int searchHashTable(int key, int size) {
		// TODO Auto-generated method stub
		j = (key%size);
		return j;
	}

	private static void createHashTable(int[] input, int size) {
		// TODO Auto-generated method stub
		hashTable = new int[size];
		j = 0;
		for( i = 0; i < input.length; i++) {
			j = (input[i]%size);
			hashTable[j] = input[i];
		}
	}

}
