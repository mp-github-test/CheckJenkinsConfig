package com.IQ;

public class ClassB extends ClassA {
	public int p = 25;

	public void show() {
		System.out.println(super.p);
		super.show();
		System.out.println("Child Keyword example");
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.show();
	}

	public ClassB() {
		System.out.println("I am a Child Class Constructor");
	}
}
