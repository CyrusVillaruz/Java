/**
 * 
 */

package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Names.
 * Runs methods from Name.java.
 * @author cyrus
 * @version 1.0
 */
public class Names {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Prompts user for first, middle, and last name input
        System.out.println("Enter your first name: ");
        String first = scan.nextLine();
        
        System.out.println("Enter your middle name: ");
        String middle = scan.nextLine();
        
        System.out.println("Enter your last name: ");
        String last = scan.nextLine();
        
        // Setting up constructor to take in user's input
        Name fullName;
        
        fullName = new Name(first, middle, last);
        
        // Takes user input using Name.java's mutators
        fullName.setFirstName(first);
        fullName.setMiddleName(middle);
        fullName.setLastName(last);
        
        // Prints out the full name using Name.java's toString() method
        System.out.println(fullName.toString());
    
        scan.close();

    }

}
