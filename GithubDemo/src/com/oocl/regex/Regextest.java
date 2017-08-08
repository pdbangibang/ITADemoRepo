package com.oocl.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regextest {
	public static boolean done = false;
	private static  List<String> users = new ArrayList<String>(); 
	private static  List<String> passwords = new ArrayList<String>(); 
//	public Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		log(done);
		
	}

	public static void log(boolean done) {
		
		Scanner input = new Scanner(System.in);
		do {
			
			System.out.println("Welcome! Please input the following details: ");
			System.out.print("Input username: ");
			String user = input.next();
			System.out.print("Input password: ");
			String pass = input.next();
			System.out.print("Confirm password: ");
			String passconf = input.next();
			

			LoginUser(user, pass, passconf);
		}while(done == false);
	}
	public static void signUp(boolean done) {
		 Scanner input = new Scanner(System.in);
		do {
			System.out.println("Login or Sign-up?");
			String choice = input.next();
			
			if(choice.equals("Login")){
				LoginUserandPass();
			} else if (choice.equals("Sign-up")) {
				done = false;
				log(done);
			} else {
				System.out.println("Wrong input. Please Try again");
			}
		}while(done == true);
	}
	
	public static void LoginUser(String user, String pass, String passconf) {
		String paramuser = "([a-z,A-Z,0-9])\\w+";
		
		boolean verified = user.matches(paramuser);
		
		if(verified) {
			users.add(user);
			LoginPass(pass, passconf);
		} else {
			System.out.println("Username should not contain special characters, please try again");
		}
	
	}
	
	public static void LoginPass(String pass, String passconf) {
		String parampass = "(^[a-zA-Z0-9!@]\\w+$)";
		
		boolean passed = pass.matches(parampass);
		if(passed) {
			if(pass.equals(passconf)) {
				passwords.add(pass);
				System.out.println("Sign up Complete. Please press enter to proceed to login");
				done = true;
				signUp(done);
			} else {
				System.out.println("Passwords do not match. Please input again");
			}
		} else {
			System.out.println("Password should only contain alpanumeric characters and '!' or '@'. Please try again");
		}
	}
	
	
	public static void LoginUserandPass() {
		boolean logged = false;
		System.out.println("Welcome! Please Log-in");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Login username: ");
		String userLog = input.next();
		System.out.print("Login password: ");
		String passLog = input.next();
		do {
			
			for(int i = 0; i < users.size(); i++) {
				if(users.get(i) ==  userLog) {
					System.out.println(users.get(i));
					for(int j=0; j < passwords.size(); j++) {
						if(passwords.get(j) == passLog) {
							System.out.println(users.get(j));
							logged = true;
						} 
					}
					System.out.println("WRONG PASSWORD! Please try again");
				}
			}

		} while(!logged);
		
		
		
	}
	
}
