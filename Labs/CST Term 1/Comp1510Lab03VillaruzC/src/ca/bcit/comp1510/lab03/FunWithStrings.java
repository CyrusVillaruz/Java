/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * FunWithStrings.
 * A program that experiments with strings.
 * @author cyrus
 * @version 1.0
 */
public class FunWithStrings {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        String userInput;
        String userInputUpCase;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the title of your favourite book: ");
        userInput = scan.nextLine();
        System.out.println(userInput);
        // Q9: The string variable printed the title as intended
        
        // Q10*: Nothing happens after the scanner's next method is used. 
        // The scanner next() method finds and returns the next completed token
        // from the scanner, and may block while waiting for input to scan.
        // I am unsure of this answer, but the documentation of the method
        // was really helpful in understanding how the method works.
        
        System.out.println("Number of characters (including spaces) in title: " 
                + userInput.length());
        
        // If title of book starts with "The"
        boolean the = userInput.startsWith("The ");
        System.out.println("Title starts with \"The\": " + the);
        
        // Q14: The .toUpperCase method does not permanently change the string
        // Strings are immutable; they cannot be changed.
        // The .toUpperCase method outputs a copy of the original string
        // in upper case letters.
        System.out.println(userInput.toUpperCase());
        System.out.println(userInput);
        
        // Q15: Assigning "userInput.toUpperCase()" to a new string
        // results in the new string outputting the original string
        // in upper case letters.
        userInputUpCase = userInput.toUpperCase();
        System.out.println(userInputUpCase);
        
        // Q16: Strings cannot be changed once initialized
        // However, you can modify copies of the original string
        // by assigning the modified version into a 
        // new string object.
        
        // Title of book in upper and lower case
        System.out.println(userInput.toUpperCase());
        System.out.println(userInput.toLowerCase());
        
        // Title of book without leading and ending spaces
        String trimmedUserInput = userInput.trim();
        System.out.println(trimmedUserInput);
        
        // User input string changes.
        String firstChar = trimmedUserInput.substring(0, 1);
        String lastChar = trimmedUserInput.substring(
                trimmedUserInput.length() - 1);
        String stringBody = trimmedUserInput.substring(1,
                trimmedUserInput.length() - 1);
        
        //  All the above changes on a single line
        System.out.println("Your modified title: ");
        System.out.print(firstChar.toUpperCase());
        System.out.print(stringBody.toLowerCase());
        System.out.print(lastChar.toUpperCase());
        
        scan.close();
    }

}
