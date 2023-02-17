/**
 * 
 */

package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * IntegerWrapper.
 * Represents integers in different ways.
 * @author cyrus
 * @version 1.0
 */
public class IntegerWrapper {
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int userInput;
        
        Scanner scan = new Scanner(System.in);
        
        // Prompts user for an integer to convert
        System.out.println("Please enter an integer to convert: ");
        userInput = scan.nextInt();
        
        // Prints the user input in Binary
        System.out.println("Your input in binary: "
                + Integer.toBinaryString(userInput));
        
        // Prints the user input in Octal
        System.out.println("Your input in octal: "
                + Integer.toOctalString(userInput));
        
        // Prints the user input in Hexadecimal
        System.out.println("Your input in hexadecimal: "
                + Integer.toHexString(userInput));
        
        // Prints out an integers minimum and maximum values     
        System.out.println("Max value of an integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of an integer: " + Integer.MIN_VALUE);
        
        // Takes two strings, converts them to ints, adds them,
        // and prints out the sum.

        System.out.println("Please enter an integer: ");
        String int1 = scan.next();
        
        System.out.println("Please enter another integer: ");
        String int2 = scan.next();
        
        System.out.print("The sum of the two integers: ");
        System.out.println(Integer.parseInt(int1) 
                + Integer.parseInt(int2));     
        
        scan.close();

    }

}
