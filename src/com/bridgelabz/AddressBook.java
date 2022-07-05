package com.bridgelabz;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class AddressBook {

	private final Map<String, List<Contacts>> map = new LinkedHashMap<>();
	private final Scanner sc = new Scanner(System.in);

	public void addContact() {

		System.out.println("Enter the number of Address Book to be created");
		int bookCount = sc.nextInt();
		for (int b = 1; b <= bookCount; b++) {
			System.out.println("Enter the Address Book Name :");
			String bookName = sc.next();
			map.put(bookName, new LinkedList<>());

			// For AddressBook to be added

			// For Contacts to be added
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
				map.get(bookName).add(contact);
				System.out.println(" ");
			}
		}
	}

	public void displayListItems() {
		int i = 0;
		for (String key : map.keySet()) {
			i++;
			System.out.println("# Address Book #" + i + ": " + key);

			for (Contacts info : map.get(key)) {
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
	}

	public void editContact() {
		int i = 0;
		while (i < 3) {
			boolean isPresent = false;
			System.out.println("Enter the name of the Address Book from which contact is to be edited");
			String name = sc.next();
			if (map.containsKey(name)) {

				System.out.println("Enter the first name of the contact to be edited");
				String newName = sc.next();

				for (Contacts info : map.get(name)) {
					if (Objects.equals(info.getFirstName(), newName)) {

						System.out.println("Contact Information to be Edited is");
						System.out.println(info.getFirstName() + "\n" + info.getLastName() + "\n" + info.getAddress()
								+ "\n" + info.getCity() + "\n" + info.getState() + "\n" + info.getZip() + "\n"
								+ info.getPhoneNo() + "\n" + info.getEmail());
						System.out.println("Enter the Contact Information to be Updated is");

						System.out.println("Enter the First Name:");
						String firstname = sc.next();
						info.setFirstName(firstname);
						System.out.println("Enter the Last Name:");
						String lastname = sc.next();
						info.setLastName(lastname);
						System.out.println("Enter the Address in words:");
						String address = sc.next();
						info.setAddress(address);
						System.out.println("Enter the City:");
						String city = sc.next();
						info.setCity(city);
						System.out.println("Enter the State Name:");
						String state = sc.next();
						info.setState(state);
						System.out.println("Enter the ZIP code:");
						int zip = sc.nextInt();
						info.setZip(zip);
						System.out.println("Enter the Phone No");
						long phone = sc.nextLong();
						info.setPhoneNo(phone);
						System.out.println("Enter email id:");
						String email = sc.next();
						info.setEmail(email);
						i = 3;
						isPresent = true;
						break;
					}
				}
				if (!isPresent) {
					System.out.println("No Such Name found, please re-enter the Name");
					i++;
				}
			} else {
				System.out.println("No Such Address Book found");
				i++;
			}
		}
		displayListItems();
	}

	public void deleteContact() {
		int i = 0;
		while (i < 3) {
			boolean isPresent = false;
			System.out.println("Enter the name of the Address Book from which contact is to be deleted");
			String name = sc.next();
			if (map.containsKey(name)) {
				System.out.println("Enter First Name of Contact to be Deleted");
				String newName = sc.next();

				for (Contacts info : map.get(name)) {
					if (Objects.equals(info.getFirstName(), newName)) {
						System.out.println(info.getFirstName() + "\n" + info.getLastName() + "\n" + info.getAddress()
								+ "\n" + info.getCity() + "\n" + info.getState() + "\n" + info.getZip() + "\n"
								+ info.getPhoneNo() + "\n" + info.getEmail());
						map.get(name).remove(info);
						isPresent = true;
						i = 3;
						break;
					}
				}
				if (!isPresent) {
					System.out.println("No Such value found");
					i++;
				}
			} else {
				System.out.println("No Such Address Book");
				i++;
			}
		}
		displayListItems();
	}

	public void addNew() {
		int j = 0;
		while (j < 3) {
			boolean isPresent = false;
			System.out.println("Enter the AddressBook Name to which Contact is to be added");
			String accountName = sc.next();
			if (map.containsKey(accountName)) {
				System.out.println("Enter the first name of the Contact to be added to AddressBook");
				String name = sc.next();
				for (Contacts info : map.get(accountName)) {
					if (Objects.equals(info.getFirstName(), name)) {
						System.out.println();
						System.out.println(info.getFirstName() + info.getLastName() + "  " + info.getAddress() + "  "
								+ info.getCity() + "  " + info.getState() + "  " + info.getZip() + "  "
								+ info.getPhoneNo() + "  " + info.getEmail());
						System.out
								.println("Contact already exists in Address Book, please use Edit option for editing");
						j = 3;
						isPresent = true;
						break;
					}
				}
				if (!isPresent) {
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
					Contacts contact = new Contacts(name, lastname, address, city, state, zip, phone, email);
					map.get(accountName).add(contact);
					j = 3;
				}
			} else {
				System.out.println();
				System.out.println("No Such Address Book");
			}
		}
		displayListItems();
	}

}