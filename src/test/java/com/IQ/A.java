package com.IQ;

public class A {

	public static void main(String[] args) {

		System.out.println("First Main Method-Primary");
		//A2.main(args);
		//A3.main(args);
	}
	
	public void main() {
		System.out.println("Not a standard main method- Class A");
	}

}

final class A2 {

	public static void main(String[] args) {

		System.out.println("Second Main Method- Final");

	}
	
	public void main() {
		System.out.println("Not a standard main method- Class A2");
	}

}

abstract class A3 {

	public static void main(String[] args) {

		System.out.println("Third Main Method- Abstract");

	}
	
	public void main() {
		System.out.println("Not a standard main method- Class A3");
	}

}
