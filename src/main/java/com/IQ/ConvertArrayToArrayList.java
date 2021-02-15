package com.IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {

	/*
	 * Using Arrays.asList() method - Pass the required array to this method and get
	 * a List object and pass it as a parameter to the constructor of the ArrayList
	 * class.
	 * 
	 * Collections.addAll() method - Create a new list before using this method and
	 * then add array elements using this method to existing list.
	 * 
	 * Iteration method - Create a new list. Iterate the array and add each element
	 * to the list.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeWaysToConvert();
	}

	public static void ThreeWaysToConvert() {
		String[] array = { "a", "b", "c", "d", "e" };

		// Method 1
		List<String> list = Arrays.asList(array);
		System.out.println(list);

		// Method 2
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, array);
		System.out.println(list1);

		// Method 3
		List<String> list2 = new ArrayList<String>();
		for (String text : array) {
			list2.add(text);
		}
		System.out.println(list2);
	}

}
