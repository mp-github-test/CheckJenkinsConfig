package com.IQ;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/*
 * 
 * List Interface
	List interface is the child interface of Collection interface. 
	It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.
 * 
 * 
 */
public class Collections_IQs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("===================ArrayList===================");
		 * arrayList();
		 * System.out.println("===================LinkedList===================");
		 * linkedList();
		 * System.out.println("===================Vector==================="); vector();
		 * System.out.println("===================Stack==================="); stack();
		 * System.out.println("===================PriorityQueue===================");
		 * priorityQueue();
		 * System.out.println("===================ArrayDeque===================");
		 * arrayDeque();
		 * System.out.println("===================HashSet===================");
		 * hashSet();
		 * System.out.println("===================LinkedHashSet===================");
		 * linkedHashSet();
		 * System.out.println("===================TreeSet===================");
		 * treeSet();
		 */

		System.out.println("===================listAndSetPrograms===================");
		listAndSetPrograms();

	}

	/*
	 * 
	 * ArrayList The ArrayList class implements the List interface. It uses a
	 * dynamic array to store the duplicate element of different data types. The
	 * ArrayList class maintains the insertion order and is non-synchronized. The
	 * elements stored in the ArrayList class can be randomly accessed.
	 * 
	 */

	/*
	 * Get and Set ArrayList The get() method returns the element at the specified
	 * index, whereas the set() method changes the element.
	 * 
	 * //accessing the element System.out.println("Returning element: "+
	 * list.get(1));//it will return the 2nd element, because index starts from 0 ;
	 * 
	 * //changing the element:- list.set(1,"Dates");
	 * 
	 * //Sorting the list:- Collections.sort(list);------Sorts the list in ascending
	 * order
	 * 
	 *
	 * Ways to iterate the elements of the collection in Java-There are various ways
	 * to traverse the collection elements:
	 * 
	 * 
	 * 1. By Iterator interface.
	 * 
	 * 2. By ListIterator interface.
	 * 
	 * 3. By for loop.
	 * 
	 * 4. By forEach() method.
	 * 
	 * 5. By forEachRemaining() method.
	 * 
	 * 
	 * //Removing specific element from arraylist
	 * 
	 * list.remove("Vijay");
	 * 
	 * //Removing element on the basis of specific position
	 * 
	 * al.remove(0);
	 * 
	 * 
	 * Sort ArrayList in Descending Order In the following example, we have created
	 * an ArrayList of type String and added some elements into it. After that we
	 * have invoked reverseOrder() method along with the sort() method of the
	 * Collections class and passed the object of the ArrayList class i.e., list
	 * that sorts the elements in the descending order.
	 * 
	 * Collections.sort(list, Collections.reverseOrder());
	 */

	public static void arrayList() {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		// DIFFERENT WAYS OF TRAVERSING THROUGH COLLECTIONS

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr1 = list.iterator();
		itr1.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});
	}

	/*
	 * How to convert Array to List We can convert the Array to List by traversing
	 * the array and adding the element in list one by one using list.add() method.
	 * Let's see a simple example to convert array elements into List.
	 * 
	 */
	public static void convertingArrayToList() {
		// Creating Array
		String[] array = { "Java", "Python", "PHP", "C++" };
		System.out.println("Printing Array: " + Arrays.toString(array));
		// Converting Array to List
		List<String> list = new ArrayList<String>();
		for (String lang : array) {
			list.add(lang);
		}
		System.out.println("Printing List: " + list);

	}

	/*
	 * How to convert List to Array We can convert the List to Array by calling the
	 * list.toArray() method. Let's see a simple example to convert list elements
	 * into array.
	 * 
	 */

	public static void convertingListToArray() {
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		// Converting ArrayList to Array
		String[] array = fruitList.toArray(new String[fruitList.size()]);
		System.out.println("Printing Array: " + Arrays.toString(array));
		System.out.println("Printing List: " + fruitList);
	}

	/*
	 * LinkedList LinkedList implements the Collection interface. It uses a doubly
	 * linked list internally to store the elements. It can store the duplicate
	 * elements. It maintains the insertion order and is not synchronized. In
	 * LinkedList, the manipulation is fast because no shifting is required.
	 * 
	 */

	public static void linkedList() {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/*
	 * Vector Vector uses a dynamic array to store the data elements. It is similar
	 * to ArrayList. However, It is synchronized and contains many methods that are
	 * not the part of Collection framework.
	 * 
	 * 
	 */

	public static void vector() {
		Vector<String> v = new Vector<String>();
		v.add("Ravi");
		v.add("Vijay");
		v.add("Ravi");
		v.add("Ajay");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/*
	 * Stack The stack is the subclass of Vector. It implements the
	 * last-in-first-out data structure, i.e., Stack. The stack contains all of the
	 * methods of Vector class and also Provides its methods like boolean push(),
	 * boolean peek(), boolean push(object o), which defines its properties.
	 * 
	 * 
	 */

	public static void stack() {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/*
	 * 
	 * Queue Interface Queue interface maintains the first-in-first-out order. It
	 * can be defined as an ordered list that is used to hold the elements which are
	 * about to be processed. There are various classes like PriorityQueue, Deque,
	 * and ArrayDeque which implements the Queue interface.
	 */

	/*
	 * PriorityQueue The PriorityQueue class implements the Queue interface. It
	 * holds the elements or objects which are to be processed by their priorities.
	 * PriorityQueue doesn't allow null values to be stored in the queue.
	 * 
	 */

	public static void priorityQueue() {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

	/*
	 * Deque Interface Deque interface extends the Queue interface. In Deque, we can
	 * remove and add the elements from both the side. Deque stands for a
	 * double-ended queue which enables us to perform the operations at both the
	 * ends.
	 * 
	 */

	/*
	 * ArrayDeque ArrayDeque class implements the Deque interface. It facilitates us
	 * to use the Deque. Unlike queue, we can add or delete the elements from both
	 * the ends.
	 * 
	 * ArrayDeque is faster than ArrayList and Stack and has no capacity
	 * restrictions.
	 * 
	 * 
	 */

	public static void arrayDeque() {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");

		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}

		/*
		 * OR
		 */

		System.out.println("----------------->Another way of traversing through collections");

		// Traversing list through Iterator
		Iterator<String> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/*
	 * Set Interface Set Interface in Java is present in java.util package. It
	 * extends the Collection interface. It represents the unordered set of elements
	 * which doesn't allow us to store the duplicate items. We can store at most one
	 * null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
	 * 
	 */

	/*
	 * HashSet HashSet class implements Set Interface. It represents the collection
	 * that uses a hash table for storage. Hashing is used to store the elements in
	 * the HashSet. It contains unique items.
	 */

	public static void hashSet() {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/*
	 * 
	 * LinkedHashSet LinkedHashSet class represents the LinkedList implementation of
	 * Set Interface. It extends the HashSet class and implements Set interface.
	 * Like HashSet, It also contains unique elements. It maintains the insertion
	 * order and permits null elements.
	 */

	public static void linkedHashSet() {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/*
	 * TreeSet Java TreeSet class implements the Set interface that uses a tree for
	 * storage. Like HashSet, TreeSet also contains unique elements. However, the
	 * access and retrieval time of TreeSet is quite fast. The elements in TreeSet
	 * stored in ascending order.
	 * 
	 */

	public static void treeSet() {
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void listAndSetPrograms() {

		ArrayList<String> li = new ArrayList<String>();
		li.add(0, "Apple");
		li.add(1, "Banana");
		li.add("Pomegranate");
		li.add(2, "Mango");
		li.add(3, "Guava");
		li.add(1, "PineApple");
		li.add("Apple");
		li.add("Mango");

		System.out.println("After add:  ");
		System.out.println(li.toString());

		/*
		 * li.remove(5); System.out.println("removal status: " + li.remove("Mango"));
		 * System.out.println("removal status: " + li.remove("Mango"));
		 * System.out.println("removal status: " + li.remove("Papaya"));
		 * 
		 * System.out.println("After removal:  "); System.out.println(li.toString());
		 * 
		 * System.out.println("existence status: " + li.contains("Banana"));
		 */

		// remove duplicates from List
		Set<String> set = new HashSet<String>();
		// set.addAll(li);

		Set<String> duplicateSet = new HashSet<String>();

		for (String item : li) {

			if (!set.add(item)) {
				duplicateSet.add(item);
			}
		}

		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "Apple");
		list.add(1, "Banana");
/*		list.add("Pomegranate");
		list.add(2, "Mango");
		list.add(3, "Guava");
		list.add(1, "PineApple");*/
		list.add("Apple");
		list.add("Mango");

		// finding number of duplicates

		/*
		 * for (String item1 : li) { System.out.println(" : "+ Collections.frequency(li,
		 * item1)); int tempCount = Collections.frequency(li, item1); if(tempCount>1) {
		 * li.removeAll(li); } }
		 */

		int count = 1;
		String currentElement="";
		
		
		for(String l : list) {
			
			for (String m : list) {
				if (l.equals(m)) {
					count = count + 1;
					currentElement = l;
					list.remove(m);
				}

			}
			if(list.size()>1)
				list.remove(currentElement);
				
				System.out.println("Occurence of list : " + currentElement + " is " + count + " times");
				count = 1;
		}
		
	
		/*for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (list.get(i).toString().equals(list.get(j).toString())) {
					count = count + 1;
					currentElement = list.get(i);
					list.remove(j);
				}

			}
			
			
		}*/

		System.out.println("After list added to Set:  ");
		System.out.println(set.toString());

		System.out.println("Duplicates after list added to Set:  ");
		System.out.println(duplicateSet.toString());

	}
}
