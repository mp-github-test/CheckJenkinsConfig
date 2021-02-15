package com.IQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ShortPrograms {

	/*
	
1.	Table
2.	Factorial
3.	Prime Number
4.	Even Number
5.	Odd Number
6.	Negative Number
7.	Fibonacci
8.	Palindrome (Number/String)
9.	Swap using 2 Numbers
10.	Swap using 3 Numbers
11.	Reverse String (Few Ways- String Buffer/StringBuilder/ByteArray/ForLoop/Collection-ArrayList)
12.	Duplicate
13.	Occurrence of a String
14.	Largest Number
15.	Smallest Number
16.	Delete last element from Array/ArrayList
17.	Delete first element from Array/ArrayList	
	
	 */

	public static void main(String[] args) {
		System.out.println("1. TABLE********************************");
		table(15);
		table(04);
		System.out.println("2. Factorial********************************");
		factorial(5);
		factorial(10);
		System.out.println("3. Prime Number Check********************************");
		isPrimeNumber(37);
		isPrimeNumber(56);
		System.out.println("4. Even Number Check********************************");
		isEvenNumber(12000);
		isEvenNumber(121);
		System.out.println("5. Odd Number Check********************************");
		isOddNumber(12001);
		isOddNumber(2);
		System.out.println("6. Negative Number Check********************************");
		isNegativeNumber(-12);
		isNegativeNumber(3);
		System.out.println("7. Print Fibonacci Series********************************");
		printFibonacciSeries(10);
		printFibonacciSeries(20);
		System.out.println("8. Palindrome Number Check********************************");
		isPalindromeNumber(234);
		isPalindromeNumber(101);
		isPalindromeNumberByString(45554);
		isPalindromeNumberByString(45674);
		System.out.println("8. Palindrome String Check********************************");
		isPalindromeString("MALAYALAM");
		isPalindromeString("LANGUAGE");
		System.out.println("9. Swapping Numbers using 2 variables********************************");
		swappingNumbersUsingTwoVariables(23, 34);
		System.out.println("10. Swapping Numbers using 3 variables********************************");
		swappingNumbersUsingThreeVariables(10, 25);
		System.out.println("11. Reverse String using StringBuilder and StringBuffer********************************");
		reverseStringUsingStrBldrStrBfr("Hello Mukesh !");
		System.out.println("11. Reverse String using For Loop- char[] Array********************************");
		reverseStringUsingForLoop("CMMI Level 5");
		System.out.println("11. Reverse String using Byte Array********************************");
		reverseStringUsingByteArray("Company");
		System.out.println("11. Reverse String using Swapping********************************");
		reverseStringUsingSwapping("L&T");
		System.out.println("11. Reverse String using ArrayList - Collections********************************");
		reverseStringUsingArrayList("Technologies");
	}

	// Table
	public static void table(int num) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(num * i);
		}
	}

	// Factorial
	public static void factorial(int num) {

		// logic 4! = 4*3*2*1
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + "'" + num + "'" + " is " + fact);
	}

	// Prime Number Check
	public static void isPrimeNumber(int num) {

		if (num == 1 || num == 2)
			System.out.println("'" + num + "'" + " is a Prime Number !");

		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println("'" + num + "'" + " is a Prime Number !");
		else
			System.out.println("'" + num + "'" + " is not a Prime Number !");

	}

	// Even Number Check
	public static void isEvenNumber(int num) {

		if (num % 2 == 0)
			System.out.println("'" + num + "'" + " is an Even Number !");
		else
			System.out.println("'" + num + "'" + " is not an Even Number !");
	}

	// Odd Number Check
	public static void isOddNumber(int num) {

		if (num % 2 == 1)
			System.out.println("'" + num + "'" + " is an Odd Number !");
		else
			System.out.println("'" + num + "'" + " is not an Odd Number !");
	}

	// Negative Number Check
	public static void isNegativeNumber(int num) {

		if (num < 0)
			System.out.println("'" + num + "'" + " is a Negative Number !");
		else
			System.out.println("'" + num + "'" + " is a Positive Number !");
	}

	// Fibonacci Series
	public static void printFibonacciSeries(int num) {

		// Logic: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

		int firstNum = 0;
		int secondNum = 1;
		System.out.println(firstNum + "\n" + secondNum);
		int thirdNum;
		for (int i = 2; i < num; i++) {
			thirdNum = firstNum + secondNum;
			System.out.println(thirdNum); // 0, 1, 2,
			firstNum = secondNum;
			secondNum = thirdNum;
		}

	}

	// Palindrome Number

	public static void isPalindromeNumber(int num) {

		// Logic, 1221 and reverse 1221 must be same

		int rem, rev = 0, temp;

		temp = num;

		// reversed integer is stored in variable
		while (num != 0) {
			rem = num % 10;
			 System.out.println("rem: " + rem);
			rev = rev * 10 + rem;
			 System.out.println("rev: " + rev);
			num = num / 10;
			 System.out.println("num: " + num);
		}

		// palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
		if (temp == rev)
			System.out.println(temp + " is a palindrome.");
		else
			System.out.println(temp + " is not a palindrome.");
	}
	
	// Palindrome Number

		public static void isPalindromeNumberByString(int num) {
			
			String original = String.valueOf(num);
			StringBuilder sbr = new StringBuilder(original);
			if(original.equals(sbr.reverse().toString())) {
				System.out.println("As given " + original + " and its reverse " + sbr.toString() + " is EQUAL, it is A Palindrome");
			}
			else
				System.out.println("As given " + original + " and its reverse " + sbr.toString() + " is NOT EQUAL, it is NOT a Palindrome");
		}
	public static void isPalindromeString(String str) {
	
		StringBuilder strBldr = new StringBuilder(str).reverse();
		String revString = strBldr.toString();
		
		if(str.equals(revString))
			System.out.println("As given " + str + " and its reverse " + revString + " is EQUAL, it is A Palindrome");
		else
			System.out.println("As given " + str + " and its reverse " + revString + " is NOT EQUAL, it is NOT a Palindrome");
			
	}
	

	// Swap using 2 variables
	public static void swappingNumbersUsingTwoVariables(int num1, int num2) {
		System.out.println("Before swapping num1 is: " + num1 + "; num2 is " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After swapping num1 is: " + num1 + ";  num2 is " + num2);

	}

	// Swap using 3 variables
	public static void swappingNumbersUsingThreeVariables(int num1, int num2) {
		System.out.println("Before swapping num1 is: " + num1 + "; num2 is " + num2);
		int num3;
		num3 = num1 + num2;
		num1 = num3 - num1;
		num2 = num3 - num2;

		System.out.println("After swapping num1 is: " + num1 + ";  num2 is " + num2);

	}

	// Reversing a String using StringBuffer and StringBuilder
	public static void reverseStringUsingStrBldrStrBfr(String str) {

		System.out.println("Original String: " + str);

		StringBuilder sbldr = new StringBuilder(str).reverse();
		System.out.println("String reversed using String Builder : " + sbldr.toString());
		StringBuffer sblfr = new StringBuffer(str).reverse();
		System.out.println("String reversed using String Buffer : " + sblfr.toString());
	}

	// Reversing a String using For loop
	public static void reverseStringUsingForLoop(String str) {
		System.out.println("Original String: " + str);

		String reversedString = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
			
		}
		System.out.println("Reversing a String using For Loop- charArray: " + reversedString);
	}

	// Reversing a String using Byte Array
	public static void reverseStringUsingByteArray(String str) {
		System.out.println("Original String: " + str);

		byte[] strAsByteArray = str.getBytes();
		byte[] result = new byte[strAsByteArray.length];

		for (int i = 0; i < strAsByteArray.length; i++) {

			result[i] = strAsByteArray[strAsByteArray.length - 1 - i];
		}
		System.out.println("Byte Array is: " + new String(result));

	}

	// Reversing a String using SWAPPING
	public static void reverseStringUsingSwapping(String str) {
		System.out.println("Original String: " + str);

		char[] temparray = str.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);
		System.out.println();

	}
	
	// Reversing a String using ArrayList- Collections.reverse() method
		public static void reverseStringUsingArrayList(String str) {
			System.out.println("Original String: " + str);

			char[] ch = str.toCharArray();
	        List<Character> trial1 = new ArrayList<>();
	 
	        for (char c : ch)
	            trial1.add(c);
	 
	        Collections.reverse(trial1);
	        Iterator<Character> li = trial1.iterator();
	        while (li.hasNext())
	            System.out.print(li.next());
	    }

		//Remove duplicates from ArrayList	
		public static void removeDuplicatesFromArrayList() {
			
		}
}
