package ca.bcit.comp1510.lab10;

/**
 * Name.
 * This class contains the methods and constructors that will be
 * used with its driver class.
 * 
 * @author cyrus
 * @version 1.0
 */
public class Name implements Comparable<Name> {
    /** Stores the first name. */
    private final String firstName;
    
    /** Stores the middle name. */
    private final String middleName;
    
    /** Stores the last name. */
    private final String lastName;
    
    /**
     * Overloaded constructor that initializes the first,
     * middle, and last names.
     * @param first the first name.
     * @param middle the middle name.
     * @param last the last name.
     * @throws IllegalArgumentException invalid argument.
     */
    public Name(String first, String middle, String last)
            throws IllegalArgumentException {
        if (first.isEmpty() || middle.isEmpty() || last.isEmpty()) {
            throw new IllegalArgumentException("Invalid Argument.");
        }
        
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    /** 
     * Overloaded constructor that initializes the first and
     * last names.
     * @param first the first name.
     * @param last the last name.
     * @throws IllegalArgumentException invalid argument.
     */
    public Name(String first, String last) 
            throws IllegalArgumentException {
        if (first.isEmpty() || last.isEmpty()) {
            throw new IllegalArgumentException("Invalid Argument.");
        }
        firstName = first;
        middleName = null;
        lastName = last;
    }
    
    /**
     * Returns the first name.
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns the middle name.
     * @return middle name.
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Returns the last name.
     * @return last name.
     */
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public int compareTo(Name testName) {
        if (this.lastName.equals(testName.lastName)) {
            /* Can check if middle names are equal instead of checking if the
             * first names are equal first, since we are checking if the 
             * middle names are equal after checking if the first names
             * are equal.*/
            if (this.middleName != null && testName.middleName != null
                    && this.middleName.equals(testName.middleName)) {
                /* Return first name integer if middle names are equal,
                 * since if the first names are equal, then we will check
                 * if the middle names are equal.*/
                return this.firstName.compareTo(testName.firstName);
            } else {
                if (this.middleName != null && testName.middleName != null) {
                    // Return the middle name integer if the middle
                    // names are not equal.
                    return this.middleName.compareTo(testName.middleName);
                } else {
                    /* Return the first name integer if the first names
                    * are not equal, // which is checked only after checking
                    * if the middle names are equal.*/
                    return this.firstName.compareTo(testName.firstName);
                }
            }
        } else {
            // Return the last name integer if the last names are not equal.
            return this.lastName.compareTo(testName.lastName);
        }
    }
    
    /**
     * Returns the instance variables to string, setting middle name
     * to be empty if it is null.
     * @return instance variables as string.
     */
    public String toString() {
        String middleNameNotNull = " ";

        if (middleName != null) {
            middleNameNotNull = " " + middleName + " ";
        }
        String fullName = firstName + middleNameNotNull + lastName;
        return fullName;
    }
}
