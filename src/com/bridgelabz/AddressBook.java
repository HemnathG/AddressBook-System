package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	List<Contacts> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addContact() {

		System.out.println("Enter the number of contacts to be created");
		int contactcount = sc.nextInt();

		for (int i = 1; i <= contactcount; i++) {
			System.out.println("Enter the First Name :");
			String firstName = sc.next();

			System.out.println("Enter the Last Name :");
			String lastName = sc.next();

			System.out.println("Enter the Address in words:");
			String address = sc.next();

			System.out.println("Enter the City:");
			String city = sc.next();

			System.out.println("Enter the State Name:");
			String state = sc.next();

			System.out.println("Enter the ZIP code:");
			int zip = sc.nextInt();

			System.out.println("Enter the Phone No");
			long phone = sc.nextLong();

			System.out.println("Enter email id:");
			String email = sc.next();

			Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phone, email);
			list.add(contact);
			System.out.println(" ");
		}
	}

	public void displayListItems() {

		for (Contacts info : list) {
			System.out.println("First Name is :" + info.getFirstName());
			System.out.println("Last Name is :" + info.getLastName());
			System.out.println("Address is :" + info.getAddress());
			System.out.println("City is :" + info.getCity());
			System.out.println("State is :" + info.getState());
			System.out.println("State is :" + info.getZip());
			System.out.println("State is :" + info.getPhoneNo());
			System.out.println("Email is :" + info.getEmail());
			System.out.println(" ");
		}
	}

	public void editContact() {
		System.out.println("Enter the first name of the contact to be edited");
		String newName = sc.next();

		for (Contacts info : list) {
			if (info.getFirstName().contains(newName)) {
				int index = list.indexOf(info);

				System.out.println("Contact Information to be Edited is");
				System.out.println(info.getFirstName() + "\n" + info.getLastName() + "\n" + info.getAddress() + "\n"
						+ info.getCity() + "\n" + info.getState() + "\n" + info.getZip() + "\n" + info.getPhoneNo()
						+ "\n" + info.getEmail());
				System.out.println("Enter the Contact Information to be Updated is");

				System.out.println("Enter the First Name:");
				String firstname = sc.next();
				System.out.println("Enter the Last Name:");
				String lastname = sc.next();
				System.out.println("Enter the Address in words:");
				String address = sc.next();
				System.out.println("Enter the City:");
				String city = sc.next();
				System.out.println("Enter the State Name:");
				String state = sc.next();
				System.out.println("Enter the ZIP code:");
				int zip = sc.nextInt();
				System.out.println("Enter the Phone No");
				long phone = sc.nextLong();
				System.out.println("Enter email id:");
				String email = sc.next();

				list.set(index, new Contacts(firstname, lastname, address, city, state, zip, phone, email));
				displayListItems();
			}
		}
	}

	public void deleteContact() {
		System.out.println("Enter First Name of Contact to be Deleted");
		String newName = sc.next();

		list.removeIf(info -> info.getFirstName().contains(newName));
		displayListItems();
	}
}