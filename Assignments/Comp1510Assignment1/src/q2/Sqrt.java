package q2;

import java.util.Scanner;

/**
 * Calculates the approximation of the value, a, to the square root
 * and prints the first 10 estimates.
 *
 * @author cyrus
 * @version 1.0
 */
public class Sqrt {
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Assigns user's input to variable "a."
        Scanner scan = new Scanner(System.in);
        System.out.println("Please assign a value for the variable \"a\": ");
        double a = scan.nextDouble();
        
        // Calculates first 10 estimates.
        double s0 = (a + 1) / 2;
        System.out.println("The first estimate: " + s0);
        
        double s1 = (s0 + a / s0) / 2;
        System.out.println("The second estimate: " + s1);
        
        double s2 = (s1 + a / s1) / 2;
        System.out.println("The third estimate: " + s2);
        
        double s3 = (s2 + a / s2) / 2;
        System.out.println("The fourth estimate: " + s3);
        
        double s4 = (s3 + a / s3) / 2;
        System.out.println("The fifth estimate: " + s4);
        
        double s5 = (s4 + a / s4) / 2;
        System.out.println("The sixth estimate: " + s5);
        
        double s6 = (s5 + a / s5) / 2;
        System.out.println("The seventh estimate: " + s6);
        
        double s7 = (s6 + a / s6) / 2;
        System.out.println("The eighth estimate: " + s7);
        
        double s8 = (s7 + a / s7) / 2;
        System.out.println("The ninth estimate: " + s8);
        
        double s9 = (s8 + a / s8) / 2;
        System.out.println("The tenth estimate: " + s9);
        
        scan.close();
    }

}
