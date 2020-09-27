package com.practice;
import java.util.*;

public class AddressBookManagement {
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to address book management problem");
		Scanner sc=new Scanner(System.in);
		Details obj2 = new Details();
		int n = 0;
		System.out.println("1.Add contact");
		System.out.println("2.Edit contact");
		n=sc.nextInt();
		if(n==1){
		System.out.println("Add a Contact:");
        System.out.println("Enter the First Name: ");
        String first=sc.nextLine();
       
        System.out.println("Enter the Last Name: ");
        String last=sc.nextLine();
        
        System.out.println("Enter the address: ");
        String address = sc.nextLine();
        System.out.println("Enter the city: ");
        String city=sc.nextLine();
        System.out.println("Enter the state: ");
        String state=sc.nextLine();
        System.out.println("Enter the zip: ");
        int zip=sc.nextInt();
        
        System.out.println("Enter phone number: ");
        long phNum=sc.nextLong();
        
        System.out.println("Enter the Email: ");
        String email=sc.next();
        Contact obj1=new Contact (first,last, address, city, state, zip, phNum,email);
        obj2.addContact(obj1);
		}
		else if(n==2){
			System.out.println("Enter the name to edit contact details");
			String name =sc.next();
			Contact con=obj2.editContactGivenName(name);
            System.out.println("The contact is:");
            System.out.println("First Name: "+con.getFirstName());
            System.out.println("Last Name: "+con.getLastName());
            System.out.println("Address: "+con.getAddress());
            System.out.println("City: "+con.getCity());
            System.out.println("State: "+con.getState());
            System.out.println("Zip: "+con.getZip());
            System.out.println("Phone No.: "+con.getPhNum());
            System.out.println("Email: "+con.getEmail());

		}
	}

}
