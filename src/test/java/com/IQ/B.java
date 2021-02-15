package com.IQ;

public class B extends A{

	public static void main(String[] args) {
		
		//Accessing static main methods from public, final and abstract class
		A.main(args);		
		A2.main(args);
		A3.main(args);	
		
			
		
		//Accessing non-static main methods from public, final and abstract class
		
		A objA = new A();
		A2 objA2 = new A2();	
		//A3 objA3 = new A3();		// Tried to access non static member from abstract class
		
	}
}


