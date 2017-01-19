package com.code.lists;
/*
 * Implement stack using array - PUSH, POP, PEEK, EMPTY
 */
public class StackArray {
	
	private int items[] = new int[50]; // Array to store stack elements
	private int top = -1;
	
	/*
	 * Push elements in stack
	 */
	public void push(int element) {
		// Check for overflow
		if(top == 50) {
			System.out.println("Stack Overflow. Cannot push element "+element);
		}
		else
			top++;
			items[top] = element;
		
	}
	
	/*
	 * Check if stack is empty
	 */
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	/*
	 * Pop element from the stack
	 */
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int popedElement = items[top];
			top--;
			return popedElement;
		}
			
	}
	
	/*
	 * Peek
	 */
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return items[top];
		}
	}

}
