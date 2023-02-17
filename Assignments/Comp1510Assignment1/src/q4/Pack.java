package q4;

import java.util.Scanner;

/**
 * Encodes a 5 MIX-character string into a single int,
 * and decodes an int back to MIX-characters.
 *
 * @author cyrus
 * @version 1.0
 */
public class Pack {
    /**
     * Constant int that holds the MIX-table base.
     */
    private static final int BASE56 = 56;
    
    /**
     * Constant int that holds number 4 to avoid checkstyle errors.
     */
    private static final int FOUR = 4;
    
    /**
     * Constant int that holds number 3 to avoid checkstyle errors.
     */

    private static final int THREE = 3;
    
    /**
     * Constant int that holds the number 2 to avoid checkstyle errors..
     */
    private static final int TWO = 2;
    
    /**
     * Constant int that holds the number 1 to avoid checkstyle errors..
     */
    private static final int ONE = 1;
    
    /**
     * Constant int that holds the number 0 to avoid checkstyle errors..
     */
    private static final int ZERO = 0;
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
        // Char variables that will store the five characters.
        char c1;
        char c2;
        char c3;
        char c4;
        char c5;
        
        // Integer variables that will be used to convert input
        // characters into their numeric value.
        int numValue1;
        int numValue2;
        int numValue3;
        int numValue4;
        int numValue5;
        
        // Prompts and converts user input to upper case.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter five characters from A to I.");
        String input = scan.nextLine();
        
        // Set input to all uppercase to always take in
        // characters A to I instead of their lowercase form.
        input = input.toUpperCase();
        
        // Store the input's characters.
        c1 = input.charAt(0);
        c2 = input.charAt(1);
        c3 = input.charAt(TWO);
        c4 = input.charAt(THREE);
        c5 = input.charAt(FOUR);
        //System.out.println(c5);
        
        // Converts input characters into their numeric value.
        numValue1 = c1 - 'A' + 1;
        numValue2 = c2 - 'A' + 1;
        numValue3 = c3 - 'A' + 1;
        numValue4 = c4 - 'A' + 1;
        numValue5 = c5 - 'A' + 1;
        
        // Outputs the encoded result of user's input.
        long encodedResult =  (long) (numValue1 * Math.pow(BASE56, FOUR)
            + numValue2 * Math.pow(BASE56, THREE)
            + numValue3 * Math.pow(BASE56, TWO) 
            + numValue4 * Math.pow(BASE56, ONE)
            + numValue5 * Math.pow(BASE56, ZERO));
        
        System.out.println("Encoded: " + encodedResult);
        
        // Extract least significant (right-most) digit
        // from result using remainders.
        numValue5 = (int) (encodedResult % BASE56);
        
        // decodedValue stores the encoded result and is used
        // during integer division to move remaining four digits
        // down one place.
        long decodedValue = encodedResult / BASE56;
        
        numValue4 = (int) (decodedValue % BASE56);
        decodedValue = decodedValue / BASE56;
        
        numValue3 = (int) (decodedValue % BASE56);
        decodedValue = decodedValue / BASE56;

        numValue2 = (int) (decodedValue % BASE56);
        decodedValue = decodedValue / BASE56;
        
        numValue1 = (int) (decodedValue % BASE56);
        decodedValue = decodedValue / BASE56;
        
        // Converting each digit back to their character value.        
        c1 = (char) (numValue1 - 1 + 'A');
        c2 = (char) (numValue2 - 1 + 'A');
        c3 = (char) (numValue3 - 1 + 'A');
        c4 = (char) (numValue4 - 1 + 'A');
        c5 = (char) (numValue5 - 1 + 'A');
        
        System.out.println("Decoded: " + c1 + c2 + c3 + c4 + c5);
        
        scan.close();
    }

}
