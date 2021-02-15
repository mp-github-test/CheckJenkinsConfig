package com.IQ;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		/*System.out.println("Hello World!");

		double str1 = 9.372;
		double str2 = 0.9372;
		double str3 = 0.09372;
		double str4 = 0.009372;

		System.out.println(formatString(str1));
		System.out.println(formatString(str2));
		System.out.println(formatString(str3));
		System.out.println(formatString(str4));*/
		//checkStrings();
		occurenceOfWordInStringUsingHashMap();
		occurenceOfWordInArrayUsingHashMap();


	}

	public static String formatString(double str1) {
		String str = Double.toString(str1);
		int count = 0;
		String finalStr = "";
		String[] newStrArray = str.split("\\.");
		String part1 = newStrArray[0].toString();
		String part2 = newStrArray[1].toString();

		if (Integer.parseInt(part1) > 0) {

			finalStr = (str1) + "e-000";
		} else {


			for (int i = 0; i < part2.length(); i++) {
				char tempStr = part2.charAt(i);
				count = count + 1;
				
					
					
				str1 = str1 * 10;
				if (Character.getNumericValue(tempStr) > 0) {
					finalStr = (str1) + "e-00" + count;
					break;
				}
			}
		}

		return finalStr;
	}
	
	public static void checkStrings() {
		String str =  "Hello MADAM MADAM Hello BOB" ;
		String[] ele =  str.split(" ");
		
		/*
		 * 1. check if palindrome
		 * 2. check occurence 
		 */
		
		for (int i =0; i <ele.length; i++) {
			String word = ele[i];
			
			//check palindrome
			StringBuffer sb = new StringBuffer(word);
			
			if(word.equals(sb.reverse().toString())) {
				System.out.println("Word : "+ word + "is a palindrome");
				
				System.out.println(checkOccurence(str, word));
			}
			else
			System.out.println("Word : "+ word + "is NOT a palindrome");
			
			
		}
		
	}
	
	public static int checkOccurence(String str, String word) {
		int count = 0;
		
		
		String[] s = str.split(" ");

		
		for (int i = 0; i < s.length; i++) {

			if (word.equals(s[i])) {
				count = count + 1;
			}
		}
		
		return count;
		
	}
	
	public static void occurenceOfWordInString() {
		String str =  "Hello MADAM MADAM Hello BOB" ;
		
		String a[]= str.split(" ");
		
		ArrayList<String> li = new ArrayList<String>();
		int count = 0;
		
		String newStr = "";
		
		for(int i=0; i<a.length; i++) {
			
			if (!newStr.contains(a[i])) {
				count = count +1;
				newStr = newStr + a[i];
			}
			
				
				
			System.out.println("Occurence of : "+ a[i] + " is: "+ count);
			/*if(li.contains(a[i])) {
				count = count +1;
			}*/
		}
		
		
		
		
	}
	
	public static void occurenceOfWordInStringUsingHashMap() {
		String str =  "Hello MADAM MADAM Hello BOB" ;
		
		String a[]= str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String item: a) {
			
			if(hm.get(item)!=null) {
			hm.put(item, hm.get(item)+1);	
			}
			else
				hm.put(item, 1);
		}
		
		System.out.println(hm);
	}
	

	public static void occurenceOfWordInArrayUsingHashMap() {
		
		String a[]= {"Apple", "Mango", "Banana", "Apple", "Mango","Apple"};
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String item: a) {
			
			if(hm.get(item)!=null) {
			hm.put(item, hm.get(item)+1);	
			}
			else
				hm.put(item, 1);
		}
		
		System.out.println(hm);
	}
		

}
