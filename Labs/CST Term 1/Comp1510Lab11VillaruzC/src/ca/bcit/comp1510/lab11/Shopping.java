package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Shopping.
 * This class simulates shopping at a store, testing methods from
 * the Transaction class.
 * @author cyrus
 * @version 1.0
 */
public class Shopping {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shopping = "y";
        Transaction transaction = new Transaction((2 + 2 + 1));
        while (shopping.equalsIgnoreCase("y")) {
            System.out.println("Enter item name: ");
            String itemName = scan.next();
            System.out.println("Enter item price: ");
            double itemPrice = scan.nextDouble();
            System.out.println("Enter item quantity: ");
            int itemQuantity = scan.nextInt();
            transaction.addToCart(itemName, itemPrice, itemQuantity);
            System.out.println("You decide you may need " + (itemQuantity + 1)
                    + " more " + itemName + "s, so you buy " 
                    + (itemQuantity + 1) + " more " + itemName + "s.");
            Item item1 = new Item(itemName, itemPrice, itemQuantity);
            Item item2 = new Item(itemName, itemPrice);
            transaction.addToCart(item1);
            transaction.addToCart(item2);
            System.out.println("Item added to cart.");
            System.out.println("Type 'y' to keep shopping, or "
                    + "type anything else to stop shopping: ");
            shopping = scan.next();
        }
        
        scan.close();
        System.out.println(transaction.toString());

    }
}
