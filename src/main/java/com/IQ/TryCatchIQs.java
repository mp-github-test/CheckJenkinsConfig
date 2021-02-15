package com.IQ;

import java.io.IOException;

public class TryCatchIQs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		tryWithOneFinallyBlock();
		tryWithOneCatchBlock();
		tryWithMultipleCatchBlockNotPossibleIfTryBlockBodyDoesNotThrowSuchException();
	}
	
	public static void tryWithOneFinallyBlock() {
		System.out.println("#1=======================================");
		
		try {
			System.out.println("I am first Try block with One finally block");
		}
		
		finally{
			System.out.println("I am first finally without Catch block");
		}
	}
	
	public static void tryWithOneCatchBlock() {
		System.out.println("#2=======================================");
		
		try {
			System.out.println("I am first Try block with one Catch block");
		}
		
		catch(Exception e){
			System.out.println("I am first finally without Catch block");
		}
	}
	
	public static void tryWithMultipleCatchBlockNotPossibleIfTryBlockBodyDoesNotThrowSuchException() throws IOException {
		System.out.println("#3=======================================");
		
		try {
			System.out.println("I am first Try block with one Catch block as for multiple catch block to be present try block must throw such types of exception, if no exceptions are thrown from try block- compile time error for unreachable code");
		}
		
		catch(Exception e){
			System.out.println("I am first finally without Catch block");
		}
		
	}
/*	
	public static void catchBeforeTry() {
		System.out.println("#4=======================================");
		
		catch(Exception e){
			System.out.println("I am first finally without Catch block");
		}
		try {
			System.out.println("I am first Try block with catch block present before");
		}
		
		
		 * Compile time errors on both catch and try 
		 * 
		 * 1. On catch - "Syntax error on token "catch", try expected"
		 * 2. On try - "Syntax error, insert "Finally" to complete TryStatement"
		 
		
	}
	
	public static void finallyBeforeTry() {
		System.out.println("#4=======================================");
		
		finally{
			System.out.println("I am first finally without Catch block");
		}
		try {
			System.out.println("I am first Try block with finally block present before");
		}
		
		
		 * Compile time errors on both finally and try 
		 * 
		 * 1. On finally - "Syntax error on token "finally", delete this token"
		 * 2. On try - "Syntax error, insert "Finally" to complete TryStatement"
		 
		
	}*/

}
