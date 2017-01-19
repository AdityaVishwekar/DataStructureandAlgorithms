package com.code.sorting.divideandconquer;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testQuickSort() {
		int input[] = {4,3,2,1};
		int n = input.length;
		QuickSort sort=new QuickSort();
		sort.quickSort(input, 0, n-1);
		int[] output = {1,2,3,4};
		Assert.assertArrayEquals(output, input);
	}

}
