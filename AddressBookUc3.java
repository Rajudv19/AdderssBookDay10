package com.BridgeLabs.day9;
import java.util.ArrayList;
import java.util.Scanner;

import com.BridgeLabs.day10.AddressBookUC5;

public class AddressBookUc3 {
	static String first_name;
	static String last_name;
	static String city;
	static String state;
	static String ph_number;
	static String zip;
	static String email;

	static ArrayList<AddressBookUc3> array = new ArrayList<AddressBookUc3>();

	public AddressBookUc3(String first_name, String last_name, String city, 
			String state, String ph_number, String zip,String email) 
	{
		this.first_name = first_name;
		this.last_name  = last_name;
		this.city       = city;
		this.state      = state;
		this.ph_number  = ph_number;
		this.zip        = zip;
		this.email      = email;
	}

	@Override
	public String toString() {
		return "\n First_name = " +  first_name + "\n Last_name  = " + last_name + 
				"\n City       = " + city        + "\n State      = " +  state + 
				"\n Ph number  = " + ph_number   + "\n Zip        = " + zip + 
				"\n Email      = " + email;
	}

	public static void editaddr(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name to edit  :");
		String name = sc.next();

		if(name.equals(first_name))
		{
			System.out.println("Enter First Name  :");
			String first_name = sc.next();
			System.out.println("Enter Last Name   :");
			String last_name = sc.next();
			System.out.println("Enter City        : ");
			String city = sc.next();
			System.out.println("Enter State       : ");
			String state = sc.next();
			System.out.println("Enter Phone Number: ");
			String ph_number = sc.next();
			System.out.println("Enter Zip         : ");
			String zip = sc.next();
			System.out.println("Enter Email       : ");
			String email = sc.next(); 

			for(AddressBookUc3 Addr : array){
				array.set(0, new AddressBookUc3(first_name, last_name, city,
						state, ph_number, zip,email));
				System.out.println("Details Edited successfully.." + Addr);
			}

		}
		else
		{
			System.out.println("Entered name is not present in Array to edit....");
		}
	}

	public static void main(String[] args)
	{

		System.out.println("Welcome to AddressBook Computation Program");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name  :");
		String first_name = sc.next();
		System.out.println("Enter Last Name   :");
		String last_name = sc.next();
		System.out.println("Enter City        : ");
		String city = sc.next();
		System.out.println("Enter State       : ");
		String state = sc.next();
		System.out.println("Enter Phone Number: ");
		String ph_number = sc.next();
		System.out.println("Enter Zip         : ");
		String zip = sc.next();
		System.out.println("Enter Email       : ");
		String email = sc.next(); 

		AddressBookUc3 A = new AddressBookUc3(first_name, last_name, city,
				state, ph_number, zip,email);

		array.add(A);

		for(AddressBookUc3 Addr : array){
			System.out.println("Details added successfully.." + Addr);
		}

		AddressBookUc3.editaddr();
	}	
}
