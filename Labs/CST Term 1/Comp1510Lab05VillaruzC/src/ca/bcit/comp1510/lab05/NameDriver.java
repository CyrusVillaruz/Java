/**
 * 
 */

package ca.bcit.comp1510.lab05;

import java.util.Scanner;

/**
 * Q4: After running the program a couple of times, the program works with
 * different names by changing the myName object's parameters.
 * 
 * NameDriver.
 * This class outputs methods from the Name class.
 * @author cyrus
 * @version 1.0
 */
public class NameDriver {

    /**
     * Drives the program. 
     * @param args unused.
     */
    public static void main(String[] args) {
        // Creates and prints the Name object with 
        // my full name as its parameters.
        Name myName = new Name("Cyrus", "Vincent", "Villaruz");
        System.out.println("My Full Name: " + myName);
        
        // Runs methods from the Name class.
        System.out.println("Length of name (excluding spaces): " 
                + myName.nameLength());
        System.out.println("Name initials: " + myName.nameInitials());
        
        // Prompts user for input on a value 'n' from 0 to the number of 
        // characters in the name (end character inclusive).
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a value for n from 0 to "
                + (myName.nameLength() + 1));
        int n = scan.nextInt();
        
        System.out.println("Specific character in name: " 
                + myName.nameSpecificChar(n));
        
        System.out.println("Alternate full name format: "
                + myName.fullNameAlt());
        
        // Prompts user to input a first name.
        // Method will then output true if it's the same as 
        // the myName object's first name.
        System.out.println("Please input another first name: ");
        String isFirstName = scan.next();
        
        System.out.println("The first name is the same as the "
                + "\"myName\" object: " + myName.isFirstName(isFirstName));
        
        // Prompts user to input a full name.
        System.out.println("Please input a first, middle, and last name: ");
        String firstName = scan.next();
        String middleName = scan.next();
        String lastName = scan.next();
        
        // Creates new string object that stores the user's first,
        // middle, and last name inputs as a full name, then prints
        // true if it matches the myName object's full name.
        Name isFullName = new Name(firstName, middleName, lastName);
        System.out.println("The full name is the same as the "
                + "\"myName\" object: " 
                + myName.isFullName(isFullName));
        
        scan.close();
    }

}
