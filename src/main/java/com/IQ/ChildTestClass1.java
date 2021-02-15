package com.IQ;

public class ChildTestClass1 extends ParentClassTest {

	public void c1() {
		System.out.println("I am from child c1");
	}
	
	public void p2() {
		System.out.println("I am from child p2");
	}
	
	public static void p3() {
		System.out.println("I am from child STATIC p3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("=============================>");
		ParentClassTest pObj = new ParentClassTest();
		pObj.p1();
		pObj.p2();
		p3();
		
		System.out.println("=============================>");
		ParentClassTest pcObj = new ChildTestClass1();
		pcObj.p1();
		pcObj.p2();
		p3();
		
		System.out.println("=============================>");
		ChildTestClass1 cObj = new ChildTestClass1();
		cObj.p1();
		cObj.p2();
		cObj.c1();
		p3();
	
		/*System.out.println("######=============================>");
		ChildTestClass1 obj2 = (ChildTestClass1) new ParentClass1();
		obj2.p1();
		obj2.p2();
		//obj2.c1();
*/		
		
		
	}

}
