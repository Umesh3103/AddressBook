package com.practice;

public class AddressBookManagement {
	public final String firstName;
	public final String lastName;
	public final String address;
	public final String city;
	public final String state;
	public final int zip;
	public final long phNum;
	public final String email;
	public AddressBookManagement(String firstName, String lastName, String address, String city, String state, int zip, long phNum, String email){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phNum=phNum;
		this.email=email;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to address book management problem");
		AddressBookManagement addressBookManagement = new AddressBookManagement("Rahul", "Agarwal", "vpo kalu", "jaitaran", "raj",306302, 1234567890, "example@gmail.com");
	}

}
