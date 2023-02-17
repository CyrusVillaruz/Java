package q3;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Calculates a discount based on purchases and referrals.
 * The discount value cannot exceed 75%.
 *
 * @author cyrus
 * @version 1.0
 */
public class DiscountCalculator {

    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int maxDiscount = 75;
        final float rate = 0.01f;
        
        int numberOfCheese;
        int numberOfReferrals;
        
        float discount;
        
        // fmt used to output discount as a percent.
        NumberFormat fmt = NumberFormat.getPercentInstance();
        
        // Prompts for user input on cheese purchased and referrals.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount of cheese purchased.");
        numberOfCheese = scan.nextInt();
        
        System.out.println("Please enter the amount of referrals.");
        numberOfReferrals = scan.nextInt();
        
        // Calculate given discount.
        discount = Math.min(numberOfCheese + numberOfReferrals, 
            maxDiscount) * rate;

        System.out.println("The discount as a float: " + discount);
        System.out.println("The discount as a percentage: " 
            + fmt.format(discount));
        
        scan.close();
    }

}
