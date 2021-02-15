package com.IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringPrograms {

	/*
	 * Java program to print reverse of a String using for loop
	 * 
	 * @param str
	 * 
	 * @return reverseString
	 */

	public static String revString(String str) {

		if (str == null || str.isEmpty()) {

			return str;
		}

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		return reverse;
	}

	/*
	 * Java program to print reverse of a String using StringBuilder
	 * 
	 * @param str
	 * 
	 * @return reverseString
	 */

	public static String revStringusingBuilder(String str) {
		if (str == null || str.isEmpty()) {

			return str;
		}

		StringBuilder strBuilder = new StringBuilder(str);
		String reverse = "";
		reverse = strBuilder.reverse().toString();
		return reverse;
	}

	/*
	 * Java program to print remove duplicates from a String using Loop
	 * 
	 * @param str
	 * 
	 * @return removedDuplicatesFromString
	 */

	public static String removeDuplicatesCharsUsingLoop(String str) {
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (!newStr.contains(String.valueOf(str.charAt(i)))) {
				newStr = newStr + str.charAt(i);
			}
		}
		return newStr;

	}

	/*
	 * Java program to print anagrams of String using charArray
	 * 
	 * @param str
	 * 
	 * @return returnAnagramStatusOfString
	 */

	public static void isAnargram(String str1, String str2) {
		boolean status = false;
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		status = Arrays.equals(arr1, arr2);

		if (status)
			System.out.println(str1 + " AND " + str2 + "  Strings are Anargrams");
		else
			System.out.println(str1 + " AND " + str2 + "  Strings are not Anargrams");

	}

	/*
	 * Java program to check if a string contains only digits
	 * 
	 * @param str
	 * 
	 * @return returnAnagramStatusOfString
	 */

	public static void checkIfOnlyDigits(String str1, int numberOfDigits) {

		int count = 0;

		for (int i = 0; i < str1.length(); i++) {

			if (Character.isDigit(str1.charAt(i))) {
				count = count + 1;
			}
		}

		if (count == numberOfDigits)
			System.out.println("String contains only " + numberOfDigits + " " + " digits.");
		else
			System.out.println("String does not contains " + numberOfDigits + " " + " digits.");
	}

	/*
	 * Java program to count number of vowels and constants in a string
	 * 
	 * @param str
	 * 
	 * @return returnAnagramStatusOfString
	 */

	public static void vowelAndConstant(String str1) {

		int vCount = 0;
		int cCount = 0;
		str1 = str1.toLowerCase();
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u') {
				vCount = vCount + 1;
			} else if (str1.charAt(i) > 'a' && str1.charAt(i) < 'z') {
				cCount = cCount + 1;
			}
		}

		System.out.println("VowelsCount is: " + vCount);
		System.out.println("ConsonantsCount is: " + cCount);
	}

	public static void occurenceOfAWord(String str1, String str2) {
		int count = 0;

		String[] s = str1.split(" ");

		for (int i = 0; i < s.length; i++) {

			if (str2.equals(s[i])) {
				count = count + 1;
			}

		}

		System.out.println("Occurence is: " + count);

	}

	public static void main(String[] args) {

		System.out.println(revString("Mohan"));
		System.out.println(revStringusingBuilder("RAJU123"));
		System.out.println(removeDuplicatesCharsUsingLoop("RARJSSJURSIR"));
		isAnargram("help  me", "m     ehelp");
		checkIfOnlyDigits("125634", 6);
		vowelAndConstant("Hello Brother!!!");
		occurenceOfAWord("My life My rules everywhere", "My");
		removeDuplicatesFromArray();
		removeDuplicatesFromArrayList();
	}
	
	//remove duplicates from array
	
	public static void removeDuplicatesFromArray() {
		
		int[] arr1 = {1,2,3,4,5,3,4,6,6,7,7,7,7,8,9,10} ;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	//remove duplicates from list
	
		public static void removeDuplicatesFromArrayList() {
			
			ArrayList<Integer> l1 = new ArrayList<Integer>();
			l1.add(1);
			l1.add(2);
			l1.add(3);
			l1.add(2);
			l1.add(4);
			l1.add(3);
			l1.add(5);
			
			Set<Integer> set = new HashSet<Integer>();
			
			for(int i =0; i<l1.size(); i++) {
				set.add(l1.get(i));
			}
			
			Iterator<Integer> it = set.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}

}
