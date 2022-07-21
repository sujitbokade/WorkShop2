package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc=new Scanner(System.in);
    Contacts contact=new Contacts();

    public void addContact(){
        System.out.println("Enter First Name:");
        contact.setFirstName(sc.next());
        System.out.println("Enter Last Name:");
        contact.setLastName(sc.next());
        System.out.println("Enter Address:");
        contact.setAddress(sc.next());
        System.out.println("Enter City:");
        contact.setCity(sc.next());
        System.out.println("Enter State:");
        contact.setState(sc.next());
        System.out.println("Enter Mobile Number:");
        contact.setMobileNumber(sc.nextLong());

    }
    void editContact() {
        System.out.println("Enter first name to for edit information");
        String firstname = sc.next();
        if (firstname.equals((contact.getFirstName()))) {
            System.out.println("Edit Information");
            System.out.println("Enter First Name: ");
            contact.setFirstName(sc.next());

            System.out.println("Enter LastName: ");
            contact.setLastName(sc.next());

            System.out.println("Enter Address: ");
            contact.setAddress(sc.next());

            System.out.println("Enter City Name: ");
            contact.setCity(sc.next());

            System.out.println("Enter State: ");
            contact.setState(sc.next());

            System.out.println("Enter MobileNumber: ");
            contact.setMobileNumber(sc.nextLong());

        } else {
            System.out.println("Invalid Person!");
        }
    }
    Contacts showInfo()
    {
        return contact;
    }
}
