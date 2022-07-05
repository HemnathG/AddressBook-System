package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to the Address Book System");
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();

		while (true) {
			System.out.println(
					"1.Create Address Book \n2.Add New Contacts \n3.Edit Contact "
					+ "\n4.Delete Contact \n5.Display Contacts \n6.Exit");
			System.out.println("Enter a Your Choice :");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				addressBook.addContact();
				System.out.println("Contact Added Successfully");
				System.out.println();
				break;
			case 2:
				addressBook.addNew();
				System.out.println("Contact Added Successfully");
				System.out.println();
				break;

			case 3:
				addressBook.editContact();
				System.out.println("Contact Updated Successfully");
				System.out.println();
				break;

			case 4:
				addressBook.deleteContact();
				System.out.println("Contact deleted Successfully");
				System.out.println();
				break;

			case 5:
				addressBook.displayListItems();
				System.out.println("Contact displayed Successfully");
				System.out.println();
				break;

			case 6:
				System.out.println("You have choosen to exit");
				System.out.println();
				return;

			default:
				System.out.println("Please Enter Valid Choice");
				System.out.println();

			}
		}
	}
}
