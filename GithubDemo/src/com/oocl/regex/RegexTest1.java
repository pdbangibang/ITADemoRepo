package com.oocl.regex;

public class RegexTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String any = ".*";
		
		String test1 = "Hello", test2= "36", test3="";
		System.out.println(test1.matches(any));
		System.out.println(test2.matches(any));
		System.out.println(test3.matches(any));
		
		String almostAny = ".+";
		
		System.out.println("---------------------------");
		
		System.out.println(test1.matches(almostAny));
		System.out.println(test2.matches(almostAny));
		System.out.println(test3.matches(almostAny));
		
		String numbersonly = "\\d*";
		
		System.out.println("---------------------------");
		
		System.out.println(test1.matches(numbersonly));
		System.out.println(test2.matches(numbersonly));
		System.out.println(test3.matches(numbersonly));	
		
		String colorOption = "(red|green|yellow)";
		
		System.out.println("---------------------------");
		
		System.out.println("red".matches(colorOption));
		System.out.println("blue".matches(colorOption));
	
		String eitherGray = "Gr(a|e)y";
		
		System.out.println("---------------------------");
		
		System.out.println("Gray".matches(eitherGray));
		System.out.println("Grey".matches(eitherGray));
		System.out.println("grey".matches(eitherGray));
		
	}

}
