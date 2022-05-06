package com.BridgeLabs.day9;
import java.util.Scanner;

public class AddressBookUc1 {
	
	public static void main(String[] args){
    	
    System.out.println("Welcome to AddressBook Computation Program");
    
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter First Name:");
	String firstName = sc.next();
	System.out.println("Enter Last Name:");
	String lastName = sc.next();
	System.out.println("Enter City : ");
	String city = sc.next();
	System.out.println("Enter State: ");
	String state = sc.next();
	System.out.println("Enter Phone Number: ");
	String phoneNo = sc.next();
	System.out.println("Enter Zip: ");
	String zip = sc.next();
	System.out.println("Enter Email: ");
	String email = sc.next();
	
	System.out.println("First name is    : " +firstName);
	System.out.println("Last name is     : " +lastName);
	System.out.println("City name is     : " +city);
	System.out.println("State name is    : " +state);
	System.out.println("Zip numbre is    : " +zip);
	System.out.println("Phone Number is  : " +phoneNo);
	System.out.println("Mail ID is       : " +email);
    }
}




