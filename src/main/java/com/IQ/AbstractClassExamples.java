package com.IQ;

public class AbstractClassExamples {
	
	public static void main(String[] args) {
				
		System.out.println("by Creating object of child class");
		childClassB cc = new childClassB();
		cc.sumofTwoNumbers();
		cc.sumofThreeNumbers();
		cc.childClassMethod();
		
		System.out.println("by Creating object of Parent reference to child class");
		ParentClass pc = new childClassB();
		pc.sumofThreeNumbers();
		pc.sumofTwoNumbers();
	}
}

abstract class ParentClass {
	
	public void sumofTwoNumbers() {
		System.out.println("Two Numbers added !");
	}
	
	abstract void sumofThreeNumbers();
}

class childClassB extends ParentClass{

	@Override
	void sumofThreeNumbers() {
		System.out.println("Three Numbers added !");

	}
	
	public void childClassMethod() {
		System.out.println("I am a child class method !");
	}
	
}

