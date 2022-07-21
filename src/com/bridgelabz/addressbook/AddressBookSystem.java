package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AddressBook addressBook=new AddressBook();
        Contacts contact=new Contacts();

        while(true){
            int input;
            System.out.println("Enter 1 to Add Contact");
            System.out.println("Enter 2 to Edit Contact");
            System.out.println("Enter 3 to exit");
             input=sc.nextInt();
            switch(input){
                case 1:
                    addressBook.addContact();
                    System.out.print(addressBook.showInfo());
                    break;
                case 2:
                    addressBook.editContact();
                    System.out.print(addressBook.showInfo());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
            }
            System.out.println();

        }

    }
}




