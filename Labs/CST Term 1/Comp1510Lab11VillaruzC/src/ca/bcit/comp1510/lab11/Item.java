package ca.bcit.comp1510.lab11;

/**
 * Item.
 * Represents an item in a store.
 * @author cyrus
 * @version 1.0
 */
public class Item {
    
    /**
     * Represents the name of the item.
     */
    private final String itemName;
    
    /**
     * Stores the item's price.
     */
    private final double itemPrice;
    
    /**
     * Stores the quantity of an item.
     */
    private final int itemQuantity;
    
    /**
     * Overloaded constructor that constructs an Item object
     * with the following parameters.
     * @param name of item.
     * @param price price of item.
     * @param quantity of item.
     */
    public Item(String name, double price, int quantity) {
        itemName = name;
        itemPrice = price;
        itemQuantity = quantity;
    }
    
    /**
     * Overloaded constructor that constructs an Item object
     * with the following parameters and sets its quantity to 1.
     * @param name of item
     * @param price of item.
     */
    public Item(String name, double price) {
        itemName = name;
        itemPrice = price;
        itemQuantity = 1;
    }
    
    /**
     * Returns the item name.
     * @return item name.
     */
    public String getItemName() {
        return itemName;
    }
    
    /**
     * Returns the item price.
     * @return item price.
     */
    public double getItemPrice() {
        return itemPrice;
    }
    
    /**
     * Returns the quantity of the item.
     * @return quantity of item.
     */
    public int getItemQuantity() {
        return itemQuantity;
    }
    
    /**
     * Returns the Item information as a string.
     * @return Item information as string.
     */
    public String toString() {
        return ("Item: " + itemName 
                + "\nItem Price: " + itemPrice 
                + "\nItem Quantity: " + itemQuantity);
    }

}
