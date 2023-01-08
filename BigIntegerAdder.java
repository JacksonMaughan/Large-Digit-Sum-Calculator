package assingment4;

import java.util.Scanner;

public class BigIntegerAdder { 
	  
	 
	// Asks the user to enter a very large positive integer  
	 // reads the input as a string 
	 // stores the digits in the string into the input parameter  
	// LinkedStack, s.  
	// The right most digit stays on top of stack 
	// Example:  
	// Number: “1234567890” 
	// s contains digits from top to bottom: 0-9-8-7-6-5-4-3-2-1 
	 private static void readNumber(LinkedStack s) { 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a very large number");
		 String num1 = input.next();
		 for(int i = num1.length(); i< 1; i--) {
		 int joe = num1.charAt(i);
		 s.push(joe);
		 }
		 //your implementation goes here 
		 


	 
	 } 
	// Adds together the two referenced input LinkedStack<int>,  
	 // assuming least significant digit on top, and 
	 // returns their sum as a string 
	 public static String add(LinkedStack s1, LinkedStack s2) { 
	     
	     LinkedStack s3 = new LinkedStack();   
	     
	     int sum = s1.pop()+s2.pop(); 
	     int carry;
	     for(int i = 1; !s1.isEmpty() && !s2.isEmpty(); i++) {
	     if(sum>10) {
	     carry = sum%10; 
	     s3.push(1);
	     }
	     s3.push(sum);
	     }
	     String result = s3.toString();
	     // your implementation goes here 
	 
	     // adds digits in both stack until  
	          // at least one of the stack is empty 
	 
	 
	     // appends leftover in first number(s1) if any 
	 
	     // appends leftover in second number(s2) if any 
	 
	     // appends last carry if there is one 
	 
	     return result; 
	 } 
	 
	 //reads two large numbers as strings 
	//stores digits in strings into stack 
	//s1 stores the digits in the first large number 
	//s2 stores the digits in the second large number 
	//adds two large numbers starting with the right most digits 
	//prints the sum to the console 
	 public static void main(String[] args) { 
	     LinkedStack s1 = new LinkedStack();   
	     LinkedStack s2 = new LinkedStack(); 
	 
	     readNumber(s1); 
	     readNumber(s2); 
	 
	     String result = add(s1, s2); 
	      
	     System.out.println("Sum=" + result); 
	     
	 } 
	 
	} 