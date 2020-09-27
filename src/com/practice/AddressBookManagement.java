package com.practice;
import java.util.*;

public class AddressBookManagement {
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to address book management problem");
		Scanner sc=new Scanner(System.in);
		Details obj2 = new Details();
		//add contact
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

}
