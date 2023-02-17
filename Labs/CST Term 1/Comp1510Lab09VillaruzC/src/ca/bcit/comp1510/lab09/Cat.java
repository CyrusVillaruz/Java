package ca.bcit.comp1510.lab09;

/**
 * Cat.
 * A Class that contains information of a cat, and methods
 * to be used in the CatHotel class.
 * @author cyrus
 * @version 1.0
 */
public class Cat {
    /** The name of the cat. */
    private final String name;
    
    /** The age of the cat.*/
    private int age;
    
    /**
     * Initializes instance variables for the cat.
     * @param name the name of the cat.
     * @param age the age of the cat.
     */
    public Cat(String name, int age) {
        this.age = age;
        
        if (name.trim().isEmpty()) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }
        
        if (age < 0) {
            this.age = 0;
        } 
    }
    
    /**
     * Initializes age of the cat. The cat initialized
     * from this constructor is given a default name 
     * "Cleo."
     * 
     * @param age the age of the cat.
     */
    public Cat(int age) {
        this.name = "Cleo";
        this.age = age;
        
        if (age < 0) {
            this.age = 0;
        } /*else {
            this.age = age;
        }*/
        
    }
    
    /**
     * Returns the name of the cat.
     * @return name of the cat.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the age of the cat.
     * @return age of the cat.
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Allows other classes to modify the age of a cat.
     * @param age the age to change.
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Outputs the cat information as a string.
     * @return cat information as string.
     */
    public String toString() {
        return "Cat Name: " + name + "\nAge: " + age + "\n";
    }
}
