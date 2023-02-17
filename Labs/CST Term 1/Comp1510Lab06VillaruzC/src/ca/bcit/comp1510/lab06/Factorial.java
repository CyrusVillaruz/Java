/**
 * 
 */

package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Factorial.
 * Calculates the factorial of a given positive integer.
 * @author cyrus
 * @version 1.0
 */
public class Factorial {
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompts user for input.
        System.out.println("Enter a positive integer: ");
        int userInput = readInt(scan);
        
        // If input is a negative.
        while (userInput < 0) {
            System.out.println("Negative integers are not allowed!"
                + "\nEnter a positive integer: ");
            userInput = readInt(scan);
        }
        
        // Calculates the factorial of the user input.
        // Outputs 1 if the input is 0.
        int n = 1;
        long factorial = 1;
        
        while (n <= userInput) {
            factorial = factorial * n;
            n++;
        }
        System.out.println("The factorial of " + userInput
                + " is " + factorial);
        
        scan.close();
    }
    
    // Method that checks if user input is not an integer,
    // and prompts user for another input.
    private static int readInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("That is not an integer!"
                    + "\nEnter a positive integer: ");
        }
        return scan.nextInt();
    }
}
