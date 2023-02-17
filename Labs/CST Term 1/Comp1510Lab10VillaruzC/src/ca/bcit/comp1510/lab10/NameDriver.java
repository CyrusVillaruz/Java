package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/**
 * NameDriver.
 * Instantiates constructors and uses methods from the Name class.
 * 
 * @author cyrus
 * @version 1.0
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        ArrayList<Name> nameList = new ArrayList<Name>();
        
        Name name1 = new Name("Cyrus", "Vincent", "Villaruz");
        Name name2 = new Name("Cathryn", "Venice", "Villaruz");
        Name name3 = new Name("Allen", "Shakya");
        Name name4 = new Name("Mikhail", "Kassam");
        
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        
        System.out.println("\nBefore Sorting: ");
        for (Name names : nameList) {
            System.out.println(names.toString());
        }
        
        System.out.println("\nSorted List: ");
        
        nameList.sort(null);
        
        for (Name names : nameList) {
            System.out.println(names.toString());

        }
    }

}
