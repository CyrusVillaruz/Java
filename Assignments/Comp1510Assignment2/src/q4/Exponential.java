package q4;

/**
 * <p>Exponential.
 * This class prints out the first 21 accurate approximations
 * of an exponential function in terms of x, from -10.0 to 10.0.</p>
 *
 * @author cyrus
 * @version 1.0
 */
public class Exponential {
    /**
     * Calculates the value of each term in an exponential
     * function.
     *   
     * @param x the number being calculated in the function.
     * @return the result of each term.
     */
    public static double exp(double x) {
        double result = 1;
        double currTerm = 1;
        int k = 0;

        while (currTerm != 0) {
            currTerm = currTerm * (x / (k + 1));
            result += currTerm;
            k++; 
        }
        return result;
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final double ten = 10.0;
        
        System.out.print("x" + "\t|");
        System.out.println("\texp(x)" 
            + "\n---------------------------------------");

        for (double x = -ten; x <= ten; x++) {
            System.out.print(x + "\t|");
            System.out.println("\t" + exp(x));
        }
    }
}

