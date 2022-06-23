package com.bridgelabz;

public class AddressBook {
	
	String firstName, lastName, address, state, city, email;
	long phoneNumber;
	int zipcode;
	
	public void setDetails() {
		firstName = "Hemnath";
		lastName = "Gunasekaran";
		address = "GillNagar";
		city = "Chennai";
		state = "TamilNadu";
		email = "hemnathdavid@gmail.com";
		phoneNumber = 994324076;
		zipcode = 600001;
		
	}
	
	public void displayDetails() {
		System.out.println("\n First Name :" + firstName + "\n Last Name :" + lastName +
				"\n Address :" + address +"\n City :" +city +"\n State :" + state + 
				"\n Email ID:" +email + "\n Mobile Number :" +phoneNumber + "\n Zip Code :" +zipcode);
	}

	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state="
				+ state + ", city=" + city + ", email=" + email + ", phoneNumber=" + phoneNumber + ", zipcode="
				+ zipcode + "]";
	}
	
	

}
