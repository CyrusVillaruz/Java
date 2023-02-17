package q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>Primes.
 * This class takes a user input, n, and finds all the primes
 * from 0 to the square root of n. We stop at the square root of n
 * because if n is not a prime, then it can be factored into two factors:
 * a and b, where at least one of the factors must be smaller than the 
 * square root of n. If no factors are less than or equal to the square root 
 * of n, then n is a prime number.</p>
 *
 * @author cyrus
 * @version 1.0
 */
public class Primes {
    /** 
     * ArrayList that stores all prime numbers as booleans.
     */
    private ArrayList<Boolean> primes;

    /**
     * Primes constructor that takes a value, n, and sets
     * the maximum number of indexes to that value.
     * 
     * @param n the maximum number of indexes in the arraylist.
     */
    public Primes(int n) {
        primes = new ArrayList<Boolean>();
        for (int i = 0; i <= n; i++) {
            primes.add(true);
        }
        calculatePrimes(n);
    }

    /**
     * Checks for indexes in the arraylist that are true.
     * If the index is true, then the method checks for multiples of the index
     * and sets each multiple to false in the arraylist 
     * using the isPrime(x) method.
     * 
     * @param n the number of indexes to check.
     */
    private void calculatePrimes(int n) {
        // Start at index 2, since 0 and 1 are not prime.
        for (int i = 2; i <= n; i++) {
            primes.set(i, isPrime(i));
        }
    }
    
    /**
     * Checks each index in arraylist that are true.
     * If the index is true, then that index is printed.
     */
    private void printPrimes() {
        // Start at index 2, since 0 and 1 are not prime.
        for (int i = 2; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Checks each index in arraylist that are true.
     * If the index is true, then count is incremented.
     * This repeats until the end of the arraylist is reached.
     * 
     * @return number of primes in arraylist.
     */
    private int countPrimes() {
        int count = 0;
        // Start at index 2, since 0 and 1 are not prime.
        for (int i = 2; i < primes.size(); i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Checks if the specified index in the arraylist
     * is a prime number.
     * 
     * @param x the index to check.
     * @return true if index at x is true; otherwise, return false.
     */
    public boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (primes.get(i)) {
                // Sets all the multiples of prime numbers to false
                // "multiplesOfPrimes += i" sets all values for the initial 
                // multiplesOfPrimes to false.
                for (int multiplesOfPrimes = i * i; 
                        multiplesOfPrimes <= x;
                        multiplesOfPrimes += i) {
                    primes.set(multiplesOfPrimes, false);
                }
            }
        }
        return primes.get(x);
    }

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program uses the sieve of "
            + "Eratosthenes to determine which numbers are prime.");
        System.out.println("Enter an upper bound: ");

        int n = scan.nextInt();

        Primes primes = new Primes(n);
        int numPrimes = primes.countPrimes();

        System.out.println("There are " + numPrimes + " primes:");
        System.out.println("The prime numbers between 0 and " + n + " are: ");  
        primes.printPrimes();

        scan.close();
    }
}
