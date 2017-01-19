package com.code.lists;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class StackArrayTest {
	
	StackArray s = new StackArray();

	@Test
	public void testPush() {
		s.push(10);
		int topElement = s.peek();
		assertEquals(10, topElement);
	}

	@Test
	public void testIsEmpty() {
		s.push(20);
		boolean result = s.isEmpty();
		assertFalse(result);
	}

	@Test
	public void testPop() {
		s.push(30);
		int popedElement = s.pop();
		assertEquals(30,popedElement);
	}

	@Test
	public void testPeek() {
		s.push(40);
		int topElement = s.peek();
		assertEquals(40, topElement);
	}

}
