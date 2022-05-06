package com.BridgeLabs.day9;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUc4Main {

	static ArrayList<AddressBookUc4> alist = new ArrayList<AddressBookUc4>();

	public void deleteAddr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to Delete..  :");
		String name = sc.next();

		if(name.equals("Srinivas")){

			System.out.println("Enter Index NO.......... : ");
			int num = sc.nextInt(); 

			alist.remove(num);
			/*	for(AddressBookUc4 Addr : alist){
				System.out.println("Successfully deleted..." + Addr);
			}*/
		}
		else{
			System.out.println("Entered name is not present in Array to delete....");
		} 
	}

	public void editAddr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to edit  :");
		String name = sc.next();

		if(name.equals("Raju"))
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

			System.out.println("Enter Index NO.......... : ");
			int num = sc.nextInt(); 

			alist.set(num, new AddressBookUc4(first_name, last_name, city,
					state, ph_number, zip, email));

			/*	for(AddressBookUc4 Addr : alist){
				int element = Addr.get(num);
				System.out.println("Details Edited successfully .." + element);	
			}	*/	
		}
		else{
			System.out.println("Entered name is not present in Array to edit....");
		}  
	} 

	public void addAddr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to check  :");
		String name = sc.next();

		if(name.equals("Raju")){
			System.out.println("Entered name is already present in Array....");
		}
		else{
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

			AddressBookUc4 addressBook = new AddressBookUc4(first_name, last_name, city,
					state, ph_number, zip,email);

			alist.add(addressBook);

			/*	for(AddressBookUc4 Addr: alist){
			Addr.AddressBook();
		}*/	
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to AddressBook Computation Program");

		AddressBookUc4 A =new AddressBookUc4("Raju    ", "D V", "HSD", "KA",
				"577527","8888888890", "raj@gmail.com    ");
		AddressBookUc4 B =new AddressBookUc4("Srinivas", "D  ", "BLR", "KA",
				"520101","8317335902", "srini@gmail.com  ");
		AddressBookUc4 C =new AddressBookUc4("Goutham ", "S T", "HSN", "KA",
				"527201","8643685678", "goutham@gmail.com");

		alist.add(A);
		alist.add(B);
		alist.add(C);

		System.out.println("Few Address details Added initially..");
		for(AddressBookUc4 Addr: alist){
			System.out.println(Addr);	
		}

		AddressBookUc4Main MainUc4 = new AddressBookUc4Main();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charecter. A --> Add, E --> Edit, D --> Delete :");
		String Ch = sc.next();
		switch(Ch)
		{
		case "A":
			MainUc4.addAddr();
			System.out.println("Total Address Details added..      " + alist);
			break;
		case "E":
			MainUc4.editAddr();
			System.out.println("After Editing Address Details..    " + alist);
			break;
		case "D":
			MainUc4.deleteAddr();
			System.out.println("After Deleting Address Details..   " + alist);
			break;
		default:
			System.out.println("Thank you for using Address Book");
		}
	}
}
