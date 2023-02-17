package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * CatHotelDriver.
 * Tests methods from the CatHotel class.
 * 
 * @author cyrus
 * @version 1.0
 */
public class CatHotelDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Random random = new Random();
        final int catMaxAge = 18;
        final int catLowerBound = -6;
        int numOfEvictedCats = random.nextInt(catMaxAge);
        
        Cat cat0 = new Cat("Neko", random.nextInt(catLowerBound, catMaxAge));
        Cat cat1 = new Cat("Hitori", random.nextInt(catLowerBound, catMaxAge));
        Cat cat2 = new Cat("Futari", random.nextInt(catLowerBound, catMaxAge));
        Cat cat3 = new Cat("Haruki", random.nextInt(catLowerBound, catMaxAge));
        Cat cat4 = new Cat("Nyan", random.nextInt(catLowerBound, catMaxAge));
        Cat cat5 = new Cat("Momo", random.nextInt(catLowerBound, catMaxAge));
        Cat cat6 = new Cat("Yuki", random.nextInt(catLowerBound, catMaxAge));
        Cat cat7 = new Cat("", random.nextInt(catLowerBound, catMaxAge));
        Cat cat8 = new Cat(random.nextInt(catLowerBound, catMaxAge));
        
        CatHotel catHotel = new CatHotel("Cat Nyation");
        
        catHotel.addCat(cat0);
        catHotel.addCat(cat1);
        catHotel.addCat(cat2);
        catHotel.addCat(cat3);
        catHotel.addCat(cat4);
        catHotel.addCat(cat5);
        catHotel.addCat(cat6);
        catHotel.addCat(cat7);
        catHotel.addCat(cat8);
        
        catHotel.printGuestList();
        System.out.println("Number of cats in hotel: " + catHotel.guestCount()
                + "\n");
        
        System.out.println("Cats over the age of " + numOfEvictedCats 
                + " have been evicted." 
                + " \nNumber of cats evicted from hotel: "
                + catHotel.removeOldGuests(random.nextInt(numOfEvictedCats))
                + "\n");
        catHotel.printGuestList();
        
        System.out.println("Cat Nyation is now closed!");
        catHotel.removeAllGuests();
        System.out.println("Number of cats in hotel: " + catHotel.guestCount()
            + "\n");
    }
}

