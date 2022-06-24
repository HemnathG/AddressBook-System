package com.bridgelabz;

public class Contacts {

	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public int zip;
	public long phoneNo;
	public  String email;
	
	
	
	public Contacts(String firstName, String lastName, String address, String city, String state, int zip, long phoneNo,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getAddress() {
		return address;
	}



	public String getCity() {
		return city;
	}



	public String getState() {
		return state;
	}



	public int getZip() {
		return zip;
	}



	public long getPhoneNo() {
		return phoneNo;
	}



	public String getEmail() {
		return email;
	}
	
}
