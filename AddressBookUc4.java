package com.BridgeLabs.day9;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUc4 {

	String first_name;
	String last_name;
	String city;
	String state;
	String ph_number;
	String zip;
	String email;
	String Add    = "A";
	String Edit   = "E";
	String Delete = "D";	

	public AddressBookUc4(String first_name, String last_name, String city, 
			String state, String ph_number, String zip,String email){

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

	public int get(int num) {

		return num;
	}
}