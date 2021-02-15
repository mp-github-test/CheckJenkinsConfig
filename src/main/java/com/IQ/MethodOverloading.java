package com.IQ;

public class MethodOverloading {

	void display(byte a) {
		System.out.println("MethodOverloading: byte got the preference....");
	}

	void display(short a) {
		System.out.println("MethodOverloading: short got the preference....");
	}

	void display(int a) {
		System.out.println("MethodOverloading: int got the preference....");
	}

	void display(long a) {
		System.out.println("MethodOverloading: long got the preference....");
	}

	void display(char a) {
		System.out.println("MethodOverloading: char got the preference....");
	}

	void display(float a) {
		System.out.println("MethodOverloading: float got the preference....");
	}

	void display(double a) {
		System.out.println("MethodOverloading: double got the preference....");
	}

}

class MethodOverloading1 {
	void display(byte a) {
		System.out.println("MethodOverloading1: byte got the preference....");
	}

	void display(short a) {
		System.out.println("MethodOverloading1: short got the preference....");
	}

	void display(int a) {
		System.out.println("MethodOverloading1: int got the preference....");
	}

	void display(long a) {
		System.out.println("MethodOverloading1: long got the preference....");
	}
}

class MethodOverloading2 {
	void display(char a) {
		System.out.println("MethodOverloading2: char got the preference....");
	}

	void display(int a) {
		System.out.println("MethodOverloading2: int got the preference....");
	}

	void display(float a) {
		System.out.println("MethodOverloading2: float got the preference....");
	}
}

class MethodOverloading3 {
	void display(int a) {
		System.out.println("MethodOverloading3: int got the preference....");
	}

	void display(long a) {
		System.out.println("MethodOverloading3: long got the preference....");
	}

	void display(float a) {
		System.out.println("MethodOverloading3: float got the preference....");
	}

	void display(double a) {
		System.out.println("MethodOverloading3: double got the preference....");
	}
}

class MethodOverloading4 {

	void display(char a) {
		System.out.println("MethodOverloading4: char got the preference....");
	}

	void display(int a) {
		System.out.println("MethodOverloading4: int got the preference....");
	}

	void display(long a) {
		System.out.println("MethodOverloading4: long got the preference....");
	}

	void display(float a) {
		System.out.println("MethodOverloading4: float got the preference....");
	}

	void display(double a) {
		System.out.println("MethodOverloading4: double got the preference....");
	}
}

class MethodOverloading5 {
	void display(byte a) {
		System.out.println("MethodOverloading5: byte got the preference....");
	}

	void display(long a) {
		System.out.println("MethodOverloading5: long got the preference....");
	}

	void display(float a) {
		System.out.println("MethodOverloading5: float got the preference....");
	}

	void display(double a) {
		System.out.println("MethodOverloading5: double got the preference....");
	}
}

class MethodOverloading6 {

	void display(long a) {
		System.out.println("MethodOverloading6: long got the preference....");
	}

	void display(float a) {
		System.out.println("MethodOverloading6: float got the preference....");
	}

	void display(double a) {
		System.out.println("MethodOverloading6: double got the preference....");
	}
}

class MethodOverloading7 {
	void display(short a) {
		System.out.println("MethodOverloading7: short got the preference....");
	}

	void display(long a) {
		System.out.println("MethodOverloading7: long got the preference....");
	}

	void display(float a) {
		System.out.println("MethodOverloading7: float got the preference....");
	}

	void display(double a) {
		System.out.println("MethodOverloading7: double got the preference....");
	}

	public static void main(String[] args) {
		System.out.println("BYTE-SHORT-INT-LONG-CHAR-FLOAT-DOUBLE");
		System.out.println("MethodOverloading============================>");
		MethodOverloading obj = new MethodOverloading();
		System.out.println("On Passing byte");
		obj.display(125);
		System.out.println("On Passing short");
		obj.display(32500);
		System.out.println("On Passing int");
		obj.display(1000000000);
		System.out.println("On Passing char");
		obj.display('C');
		
		
		
		System.out.println("");
		System.out.println("BYTE-SHORT-INT-LONG");
		System.out.println("MethodOverloading1============================>");
		MethodOverloading1 obj1 = new MethodOverloading1();
		System.out.println("On Passing char");
		obj1.display('C');
		System.out.println("On Passing short");
		obj1.display(32500);
		System.out.println("On Passing int");
		obj1.display(1000000000);
		
		
		System.out.println("");
		System.out.println("CHAR-INT-FLOAT");
		System.out.println("MethodOverloading2============================>");
		MethodOverloading2 obj2 = new MethodOverloading2();
		System.out.println("On Passing byte");
		obj2.display(125);
		System.out.println("On Passing char");
		obj2.display('C');
		System.out.println("On Passing int");
		obj2.display(2000000000);
		System.out.println("On Passing short");
		obj2.display(32500);
		
		
		System.out.println("");
		System.out.println("INT-LONG-FLOAT-DOUBLE");
		System.out.println("MethodOverloading3============================>");
		MethodOverloading3 obj3 = new MethodOverloading3();
		System.out.println("On Passing char");
		obj3.display('C');
		System.out.println("On Passing int");
		obj3.display(2000000000);
		System.out.println("On Passing long");
		obj3.display(12345678910L);
		System.out.println("On Passing float");
		obj3.display(2.1231234);
		
		
		System.out.println("");
		System.out.println("CHAR-INT-LONG-FLOAT-DOUBLE");
		System.out.println("MethodOverloading4============================>");
		MethodOverloading4 obj4 = new MethodOverloading4();
		System.out.println("On Passing short");
		obj4.display(32500);
		System.out.println("On Passing char");
		obj4.display('C');
		
		
		System.out.println("");
		System.out.println("BYTE-LONG-FLOAT-DOUBLE");
		System.out.println("MethodOverloading5============================>");
		MethodOverloading5 obj5 = new MethodOverloading5();
		System.out.println("On Passing char");
		obj5.display('C');
		
		
		System.out.println("");
		System.out.println("LONG-FLOAT-DOUBLE");
		System.out.println("MethodOverloading6============================>");
		MethodOverloading6 obj6 = new MethodOverloading6();
		System.out.println("On Passing int");
		obj6.display(2000000000);
		
		
		System.out.println("");
		System.out.println("SHORT-LONG-FLOAT-DOUBLE");
		System.out.println("MethodOverloading7============================>");
		MethodOverloading7 obj7 = new MethodOverloading7();
		System.out.println("On Passing short");
		obj7.display(32322);
		System.out.println("On Passing long");
		obj7.display(12345678910L);
		System.out.println("On Passing float");
		obj7.display(2.1231234);
		System.out.println("On Passing int");
		obj7.display(2000000000);

	}
}
