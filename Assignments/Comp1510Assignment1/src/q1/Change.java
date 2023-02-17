package q1;

import java.util.Scanner;

/**
 * Outputs the user's change into bills and coins.
 *
 * @author cyrus
 * @version 1.0
 */
public class Change {
    /**
     * Initializing constants with original values multiplied by
     * 100 to avoid floating point errors.
     * 
     * Constant int that stores the value of a 10 dollar bill.
     */
    private static final int TENBILL = 1000;
        
    /**
     * Constant int that stores the value of a 5 dollar bill.
     */
    private static final int FIVEBILL = 500;
        
    /**
     * Constant int that stores the value of a toonie.
     */
    private static final int TOONIECOIN = 200;
        
    /**
     * Constant int that stores the value of a loonie.
     */
    private static final int LOONIECOIN = 100;
        
    /**
     * Constant int that stores the value of a quarter.
         */
    private static final int QUARTERCOIN = 25;
        
    /**
     * Constant int that stores the value of a dime.
     */
    private static final int DIMECOIN = 10;
        
    /**
     * Constant int that stores the value of a nickel.
     */
    private static final int NICKELCOIN = 5;
        
    /**
     * Constant int that stores the value of a penny.
     */
    private static final int PENNYCOIN = 1;

    /**
     * Constant modifier to prevent floating point errors.
     */
    private static final int FLOATMODIFIER = 100;
    /**
     * Drives the program.
     *
     * @param args unused.
     */
        
    public static void main(String[] args) {
        
        // Prompts for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a monetary value:");
        double change = scan.nextDouble() * FLOATMODIFIER;
        
        // Calculates the change.
        int ten = (int) (change / TENBILL);
        change = change % TENBILL;
        System.out.println("Ten dollar bills: " + ten);
        
        int five = (int) (change / FIVEBILL);
        change = change % FIVEBILL;
        System.out.println("Five dollar bills: " + five);
        
        int two = (int) (change / TOONIECOIN);
        change = change % TOONIECOIN;
        System.out.println("Toonies: " + two);
        
        int one = (int) (change / LOONIECOIN);
        change = change % LOONIECOIN;
        System.out.println("Loonies: " + one);
        
        int quarter = (int) (change / QUARTERCOIN);
        change = change % QUARTERCOIN;
        System.out.println("Quarters: " + quarter);
        
        int dime = (int) (change / DIMECOIN);
        change = change % DIMECOIN;
        System.out.println("Dimes: " + dime);
        
        int nickel = (int) (change / NICKELCOIN);
        change = change % NICKELCOIN;
        System.out.println("Nickels: " + nickel);
        
        int penny = (int) (change / PENNYCOIN);
        change = change % PENNYCOIN;
        System.out.println("Pennies: " + penny);
        
        scan.close();
    }

}
