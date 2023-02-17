package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * ReverseArray.
 * Takes the user input, prompts for more input based on the value
 * of the first input and stores these inputs in an array, and reverses
 * the array.
 * @author cyrus
 * @version 1.0
 */
public class ReverseArray {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter an integer: ");
        int input1 = readInt(scan);
        int[] userArray = new int[input1];
        for (int i = 0; i < input1; i++) {
            System.out.println("Enter " + input1 + " More Integer(s): ");
            int input2 = readInt(scan);
            userArray[i] += input2;
        }
        
        swap(userArray, userArray.length);
        
        scan.close();
    }
    
    /**
     * Support method that swaps the order of 
     * the values of a given array.
     * @param a the array to swap.
     * @param l the length of the array
     */
    private static void swap(int[] a, int l) {
        int temp;
        
        for (int i = 0; i < l / 2; i++) {
            temp = a[i];
            a[i] = a[l - i - 1];
            a[l - i - 1] = temp;
        }
        
        System.out.println("Reversed Array: ");
        for (int k = 0; k < l; k++) {
            System.out.print(a[k] + " ");
        }
    }
    
    /**
     * Support method that prompts user for a valid integer
     * input.
     * @param scan the scanner that checks user input.
     * @return a valid integer.
     */
    private static int readInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("That is not an integer!"
                    + "\nEnter an integer: ");
        }
        return scan.nextInt();
    }

}
