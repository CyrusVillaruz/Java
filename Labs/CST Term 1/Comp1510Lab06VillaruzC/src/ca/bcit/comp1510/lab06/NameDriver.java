/**
 * 
 */

package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * NameDriver.
 * Tests lab6 methods from the Name.java class
 * @author cyrus
 * @version 1.0
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        // Stores names as string to allow for mutations.
        String firstName = "   Cyrus";
        String middleName = "Vincent   ";
        String lastName = "   Villaruz   ";
        
        // Creates and prints the Name objects and their mutations, if any.
        Name name1 = new Name(firstName, middleName, lastName);
        Name name2 = new Name("    ", middleName.toUpperCase(), "    ");
        Name name3 = new Name(firstName.toLowerCase(), 
                middleName.replace('n', 'Z'), "    ");
        
        System.out.println("Name1: " + name1.toString());
        System.out.println("Name2: " + name2.toString());
        System.out.println("Name3: " + name3.toString());
        
        // Prompts user for input on a value 'n' from 0 to the number of 
        // characters in the name (end character inclusive).
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a value for n from 0 to "
                + (name1.nameLength() + 1 + " for Name1: "));
        int a = scan.nextInt();
        
        System.out.println("Please input a value for n from 0 to "
                + (name2.nameLength() + 1 + " for Name2: "));
        int b = scan.nextInt();
        System.out.println("Please input a value for n from 0 to "
                + (name3.nameLength() + 1 + " for Name3: "));
        int c = scan.nextInt();
        
        // Outputs the character at specified index n, and
        // outputs '@' if n is outside the length of the name.
        System.out.println("Specific character in name1: " 
                + name1.nameSpecificChar(a));
        System.out.println("Specific character in name2: " 
                + name2.nameSpecificChar(b));
        System.out.println("Specific character in name3: " 
                + name3.nameSpecificChar(c));
        
        // Using optional setters to mutate the Name objects.
        
        name1.setFirstName("   XYRUS");
        name1.setMiddleName("vIhCeHt    ");
        name1.setLastName("    ViKKarUz    ");
        System.out.println("Name1 Mutated Using Setters: " + name1);
        
        name2.setFirstName(firstName.trim().replace('C', 'x'));
        name2.setMiddleName(middleName.replace('n', 'h'));
        name2.setLastName(lastName.replace('l', 'K'));
        System.out.println("Name2 Mutated Using Setters: " + name2);
        
        name3.setFirstName(firstName.trim().replace('C', 'x'));
        name3.setMiddleName(middleName.replace('n', 'h'));
        name3.setLastName(lastName.replace('l', 'K'));
        System.out.println("Name3 Mutated Using Setters: " + name3);
        
        scan.close();
    }

}
