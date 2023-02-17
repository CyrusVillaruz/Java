package ca.bcit.comp1510.lab11;

/**
 * Transaction.
 * Represents making purchases for items when shopping.
 * @author cyrus
 * @version 1.0
 */
public class Transaction {
    /**
     * Represents a cart that stores the items.
     */
    private Item[] cart;
    
    /**
     * Stores the total price of the Items.
     */
    private double totalPrice;
    
    /**
     * Stores the quantity of a given item in a cart.
     */
    private int itemCount;
    
    /**
     * Constructs an object that represents an empty cart with a
     * given size.
     * @param cartSize size of the cart.
     */
    public Transaction(int cartSize) {
        cart = new Item[cartSize];
        totalPrice = 0;
        itemCount = 0;
    }
    
    /**
     * Overloaded method that adds items to the cart based on the 
     * following parameters.
     * @param name of item.
     * @param price of item.
     * @param quantity of item.
     */
    public void addToCart(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        for (int i = 0; i < quantity; i++) {
            cart[itemCount] = item;
            itemCount++;
            if (itemCount == cart.length) {
                increaseSize();
            }
        }
        totalPrice += (price * quantity);
    }
    
    /**
     * Overloaded method that adds items to the cart based on the
     * following parameters.
     * @param item the Item object to add.
     */
    public void addToCart(Item item) {
        int numOfItems = item.getItemQuantity();
        for (int i = 0; i < numOfItems; i++) {
            cart[itemCount] = item;
            itemCount++;
            if (itemCount == cart.length) {
                increaseSize();
            }
        }
        totalPrice += (item.getItemPrice() * numOfItems);
    }
    
    /**
     * Increases the size of the cart, ensuring there is
     * always 3 more items that can be added.
     */
    public void increaseSize() {
        Item[] newCart = new Item[cart.length + (2 + 1)];
        for (int i = 0; i < cart.length; i++) {
            newCart[i] = cart[i];
        }
        cart = newCart;
        newCart = null;
    }
    
    /**
     * Returns the total price of the items in the cart.
     * @return total price of items in cart.
     */
    public double getTotalPrice() {
        int totalItemPrice = 0;
        for (int i = 0; i < cart.length; i++) {
            totalItemPrice += cart[i].getItemPrice();
        }
        return totalItemPrice;
    }
    
    /**
     * Returns the total number of items in the cart.
     * @return number of items in the cart.
     */
    public int getCount() {
        int totalItems = 0;
        for (int i = 0; i < cart.length; i++) {
            totalItems += cart[i].getItemQuantity();
        }
        return totalItems;
    }
    
    /**
     * Returns a list of items in the cart with their details.
     * @return items with their name, quantity, and price.
     */
    public String toString() {
        String contents = "Shopping Cart Items: \n";
        for (int i = 0; i < itemCount; i++) {
            contents += cart[i] + "\n";
        }
        contents += "\nTotal Price: " + totalPrice + "\n";
        return contents;
    }
}
