package com.code.sorting.divideandconquer;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testMain() {

		int input[] = {1,2,3,4};
		int n = input.length;
		MergeSort sort=new MergeSort();
		sort.useMerge(input,0,n-1);
		int[] output = {4,3,2,1};
		Assert.assertArrayEquals(output, input);
	}
}
