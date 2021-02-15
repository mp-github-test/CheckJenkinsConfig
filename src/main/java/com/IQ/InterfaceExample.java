package com.IQ;

public interface InterfaceExample {
	
	public static void main(String[] args) {
	
		System.out.println("by Creating object of child class");
		childClassA cc = new childClassA();
		cc.sumofTwoNumbers();
		cc.sumofFiveNumbers();
		cc.sumofThreeNumbers();
		cc.childClassMethod();
		
		System.out.println("by Creating object of Parent reference to child class");
		ParentInterface pc = new childClassA();
		pc.sumofTwoNumbers();
		pc.sumofFiveNumbers();
		pc.sumofThreeNumbers();
		ParentInterface.sumofFourNumbers();
	}

}

interface ParentInterface {
	
	void sumofTwoNumbers();
	
	default void sumofThreeNumbers() {
		System.out.println("Three Numbers added !");
	}
	
	static void sumofFourNumbers() {
		System.out.println("Four Numbers added !");
	}
	
	public abstract void sumofFiveNumbers();
}

class childClassA implements ParentInterface{

	@Override
	public void sumofTwoNumbers() {
		System.out.println("Two Numbers added !");
		
	}

	@Override
	public void sumofFiveNumbers() {
		System.out.println("Five Numbers added !");
		
	}
	
	public void childClassMethod() {
		System.out.println("I am a child class method !");
	}
	
}
