package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to the Address Book System");
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();

		while (true) {
			System.out.println("1.Adding Contact \n2.Edit Contact \n3.Delete Contact \n4.Display Contacts \n5.Exit");
			System.out.println("Enter a Your Choice :");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addressBook.addContact();
				System.out.println("Contact Added Successfully");
				break;

			case 2:
				addressBook.editContact();
				System.out.println("Contact Updated Successfully");
				break;

			case 3:
				addressBook.deleteContact();
				System.out.println("Contact deleted Successfully");
				break;
				
			case 4:
				addressBook.displayListItems();
				System.out.println("Contact displayed Successfully");
				break;	

			case 5:
				System.out.println("You have choosen to exit");
				return;

			default:
				System.out.println("Please Enter Valid Choice");

			}
		}
	}
}
