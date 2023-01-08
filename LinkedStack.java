package assingment4;

import java.util.LinkedList;
import java.util.Scanner;


	 
	public class LinkedStack implements StackInterface {
		LinkedList<Integer> elements;
		@Override
		public void push(int digit) {
			elements.addFirst(digit);
			
		}

		@Override
		public int pop() {
			
			return elements.removeFirst();
		}

		@Override
		public int top() {
			
			return elements.peekFirst();
		}

		@Override
		public boolean isEmpty() {
			
			return elements.isEmpty();
		}

	}
	
			
