package com.IQ;

public class SwitchCaseIQs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noBreakStatement();
		withBreakStatement();
		defaultBeforeMatchingCaseWithBreak();
		defaultBeforeMatchingCaseWithoutBreak();
		withoutDefaultWithMatchingCase();
		withoutDefaultWithNoMatchingCase();
		withOnlyDefaultCase();
		defaultBeforeMatchingCaseWithOutBreak();
		defaultInBetweenWithoutMatchingCaseWithOutBreak();
	}

	public static void noBreakStatement() {
		System.out.println("#1=======================================");

		int i = 1;

		switch (i) {

		case 0:
			System.out.println("before matching case");

		case 1:
			System.out.println("Matching case  with No break statement included");

		case 2:
			System.out.println("after matching case");

		default:
			System.out.println("default case");
		}
	}

	public static void withBreakStatement() {

		System.out.println("#2=======================================");
		int i = 1;

		switch (i) {

		case 0:
			System.out.println("before matching case");
			break;

		case 1:
			System.out.println("Matching case With break statement included");
			break;

		case 2:
			System.out.println("after matching case");
			break;

		default:
			System.out.println("default case");
		}
	}

	public static void defaultBeforeMatchingCaseWithBreak() {

		System.out.println("#3=======================================");
		int i = 1;

		switch (i) {

		default:
			System.out.println("default case with Break");
			break;

		case 0:
			System.out.println("before matching case");
			break;

		case 1:
			System.out.println("Matching case With break statement included");
			break;

		case 2:
			System.out.println("after matching case");
			break;

		}
	}

	public static void defaultBeforeMatchingCaseWithoutBreak() {

		System.out.println("#4=======================================");
		int i = 1;

		switch (i) {

		default:
			System.out.println("default case without Break");

		case 0:
			System.out.println("before matching case");
			break;

		case 1:
			System.out.println("Matching case With break statement included");
			break;

		case 2:
			System.out.println("after matching case");
			break;

		}
	}
	
	public static void withoutDefaultWithMatchingCase() {

		System.out.println("#5=======================================");
		int i = 1;

		switch (i) {

		case 0:
			System.out.println("before matching case");
			break;

		case 1:
			System.out.println("Matching case With break statement included");
			break;

		case 2:
			System.out.println("after matching case");
			break;

		}
	}

	public static void withoutDefaultWithNoMatchingCase() {

		System.out.println("#6=======================================");
		int i = 5;

		switch (i) {

		case 0:
			System.out.println("before matching case");
			break;

		case 1:
			System.out.println("Matching case With break statement included");
			break;

		case 2:
			System.out.println("after matching case");
			break;

		}
	}
	
	public static void withOnlyDefaultCase() {

		System.out.println("#7=======================================");
		int i = 5;

		switch (i) {

		default:
			System.out.println("Only default case present without Break");

		}
	}
	
	public static void defaultBeforeMatchingCaseWithOutBreak() {

		System.out.println("#8=======================================");
		int i = 1;

		switch (i) {

		default:
			System.out.println("default case with Break");

		case 0:
			System.out.println("before matching case");

		case 1:
			System.out.println("Matching case With break statement included");

		case 2:
			System.out.println("after matching case");
		}
	}
	
	public static void defaultInBetweenWithoutMatchingCaseWithOutBreak() {

		System.out.println("#9=======================================");
		int i = 10;

		switch (i) {

		case 014:
			System.out.println("before matching case");
			
		default:
			System.out.println("default case with Break");

		case 10:
			System.out.println("Matching case With break statement included");

		case 2:
			System.out.println("after matching case");
		}
	}
	
}


/*
 *  OUTPUTs of the mentioned programs:
   
 
#1=======================================
Matching case  with No break statement included
after matching case
default case
#2=======================================
Matching case With break statement included
#3=======================================
Matching case With break statement included
#4=======================================
Matching case With break statement included
#5=======================================
Matching case With break statement included
#6=======================================
#7=======================================
Only default case present without Break
#8=======================================
Matching case With break statement included
after matching case
#9=======================================
default case with Break
Matching case With break statement included
after matching case

 
 * 
 */
