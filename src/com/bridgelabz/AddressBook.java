package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> Book = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
        public void Details () {

           Scanner scanner = new Scanner(System.in);
            Contacts Details = new Contacts();
            System.out.println("Enter the First Name of person");
            Details.setFirstName(scanner.nextLine());
            System.out.println("Enter the Last Name of person");
            Details.setLastName(scanner.nextLine());
            System.out.println("Enter the Address Name of person");
            Details.setAddress(scanner.nextLine());
            System.out.println("Enter the City Name of person");
            Details.setCity(scanner.nextLine());
            System.out.println("Enter the State Name of person");
            Details.setState(scanner.nextLine());
            System.out.println("Enter the Email of person");
            Details.setEmail(scanner.nextLine());
            System.out.println("Enter the Zip code of person");
            Details.setZipCode(scanner.nextInt());
            System.out.println("Enter the Phone number of person");
            Details.setPhoneNumber(scanner.nextInt());

            Book.add(Details);

            System.out.println(Book);
        }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management System");
        AddressBook Details = new AddressBook();


    }


    }
