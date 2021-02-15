package com.IQ;

public class C extends A3{

	public static void main(String[] args) {

		// Trying to create object of an abstract class after extending it
		// A3 obj1 = new A3(); 	// Not a valid approach, still gives the compile time error
		
		
		//Valid approach to access non static methods from an abstract class
		A3 obj = new C();
		obj.main();
		
		C obj1 = new C();
		obj1.main();
	}

}
