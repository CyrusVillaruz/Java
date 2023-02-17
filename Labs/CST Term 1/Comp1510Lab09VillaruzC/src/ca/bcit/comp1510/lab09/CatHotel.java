package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * CatHotel.
 * A Class that contains methods to add and remove
 * cats in an imaginary hotel.
 * 
 * @author cyrus
 * @version 1.0
 */
public class CatHotel {
    /** Stores a list of cats. */
    private ArrayList<Cat> catList;
    
    /** Stores the hotel's name. */
    private String hotelName;
    
    /**
     * Initializes the instance variables.
     * @param name the hotel's name.
     */
    public CatHotel(String name) {
        catList = new ArrayList<Cat>();
        this.hotelName = name;
    }
    
    /**
     * Adds the cat to the hotel.
     * @param cat the cat to add.
     */
    public void addCat(Cat cat) {
        catList.add(cat);
    }
    
    /**
     * Removes all cats in the hotel.
     */
    public void removeAllGuests() {
        catList.clear();
    }
    
    /**
     * Outputs the size of the cat hotel.
     * @return number of cats in hotel.
     */
    public int guestCount() {
        return catList.size();
    }
    
    /**
     * Removes cats that are older than specified age.
     * @param evictedCatAge the specified age to check.
     * @return number of evicted cats.
     */
    public int removeOldGuests(int evictedCatAge) {
        int numOfEvictedCats = 0;
        
        Iterator<Cat> catIterator = catList.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > evictedCatAge) {
                catIterator.remove();
                numOfEvictedCats++;
            }
        }
        return numOfEvictedCats;
    }
    
    /**
     * Outputs the hotel name and all cats currently in hotel,
     * prior to eviction.
     */
    public void printGuestList() {
        System.out.println("Welcome to " + hotelName);
        for (Cat cat : catList) {
            System.out.println(cat);
        }
    }
}
