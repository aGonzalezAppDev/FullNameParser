package com.learntocode;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // ask user for name
        System.out.println("Please enter your name: ");
        String fullName = myScanner.nextLine().trim();

        // make array
        String[] parts = fullName.split(" ");

        // go through array and take what we need
        String firstName =parts[0];
        String lastName = parts[parts.length -1];
        String middleName = "";

        // if statement for full name
        if (parts.length == 3) {
            middleName = parts[1];
        }

        // output
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}
