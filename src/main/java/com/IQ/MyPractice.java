package com.IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print reverse of a string

		String str = "Hello";
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);

		// remove duplicates from a string

		String str1 = "shobhit";
		String newStr = "";

		for (int i = 0; i < str1.length(); i++) {

			String temp = Character.toString(str1.charAt(i));

			if (!(newStr.contains(temp))) {
				newStr = newStr + temp;
			}
		}

		System.out.println(newStr);

		// swap 2 numbers using 2 variables

		int x = 4;
		int y = 6;

		x = x + y; // 10
		y = x - y; // 4
		x = x - y; // 6
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		// swap 2 numbers using 3 variables

		int x1 = 14;
		int y1 = 16;
		int z;

		z = x1 + y1; // 30
		x1 = z - x1; // 14
		y1 = z - y1; // 16
		System.out.println("x1: " + x1);
		System.out.println("y1: " + y1);

		// remove duplicates from a list

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);

		for (Integer e : list) {
			System.out.println("list: " + e);
		}

		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);

		for (Integer e : set) {
			System.out.println("Set: " + e);
		}

		// print occurence of a word in a String

		String mainStr = "Mine is mine Not yours";
		String repStr = "Mine";
		int count = 0;

		String[] ar = mainStr.split(" ");

		for (int i = 0; i < ar.length; i++) {

			if (repStr.equalsIgnoreCase(ar[i])) {
				count = count + 1;
			}
		}

		System.out.println("Occurence of : '" + repStr + "' is: " + count);

		// print fibonacci series 0,1,1,2,3,5,8,13,21;

		int n1 = 0;
		int n2 = 1;
		int n3;

		System.out.println(n1); // 0
		System.out.println(n2); // 1
		for (int i = 0; i < 10; i++) {

			n3 = n1 + n2; // 1,2
			n1 = n2; // 1
			n2 = n3; // 1

			System.out.println(n3);

		}

		// check if palindrome

		String pd = "MADAM";

		// way1 - using String buffer/builder

		StringBuffer sb = new StringBuffer(pd);
		if (pd.equals(sb.reverse().toString())) {
			System.out.println("String is palindrome");
		} else
			System.out.println("String is NOT palindrome");

		// way2 - using loop- first rev srting then compare

		for (int i = 0; i < pd.length(); i++) {

		}

		// concatenate two arrays
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] c;

		int length = arr1.length + arr2.length;
		c = new int[length];

		int index = 0;

		for (int i = 0; i < arr1.length; i++) {
			c[index] = arr1[i];
			index++;
		}

		for (int i = 0; i < arr2.length; i++) {
			c[index] = arr2[i];
			index++;
		}

		System.out.println(Arrays.toString(c));

		// remove duplicates from array

		int[] array = { 1, 2, 3, 4, 5, 5, 5, 6,7,7 };

		List<Integer> li = new ArrayList<Integer>();
		Set<Integer> sese = new HashSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			li.add(array[i]);
			sese.add(array[i]);
		}

		/*Set<Integer> se = new HashSet<Integer>();
		se.addAll(li);
		*/
		Iterator<Integer> it = sese.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		String a = "1234";
		
		if(Integer.parseInt(a)==1234) {
			System.out.println("true");
		}
	}

}
