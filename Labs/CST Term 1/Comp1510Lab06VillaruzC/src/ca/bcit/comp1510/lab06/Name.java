/**
 * 
 */

package ca.bcit.comp1510.lab06;

/**
 * Name.
 * A program that contains details of a name.
 * @author cyrus
 * @version 1.0
 */
public class Name {
    /** String that will hold the first name. */
    private String firstName;
    
    /** String that will hold the middle name. */
    private String middleName;
    
    /** String that will hold the last name. */
    private String lastName;
    
    /** A constructor that has the following string parameters. 
     * @param first String that holds first name
     * @param middle String that holds middle name
     * @param last String that holds last name
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;

        if (first.trim().isEmpty()) {
            firstName = "JANE";
        }
        if (middle.trim().isEmpty()) {
            middleName = "PHIL";
        }
        if (last.trim().isEmpty()) {
            lastName = "DOE";
        }
    }
    
    /** String that returns the first name. 
     * @return firstName as a string.
     */ 
    public String getFirstName() {
        return firstName;
    }
    
    /** Allows firstName to be modified from other classes.
     * @param first modifies the first name.
     */
    public void setFirstName(String first) {
        String name1;
        
        if (first.trim().isEmpty()) {
            first = null;
        } else {
            name1 = first.substring(0, 1).toUpperCase()
                    + first.substring(1).toLowerCase();
            firstName = name1;
        }
    }

    /** String that returns the middle name. 
     * @return middleName as a string.
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /** Allows middleName to be modified from other classes. 
     * @param middle modifies the middle name
     */
    public void setMiddleName(String middle) {
        String name2;
        
        if (middle.trim().isEmpty()) {
            middle = null;
        } else {
            name2 = middle.substring(0, 1).toUpperCase()
                + middle.substring(1).toLowerCase();
            middleName = name2;            
        }
    }

    /** String that returns the last name. 
     * @return lastName as a string.
     */
    public String getLastName() {
        return lastName;
    }
    
    /** Allows lastName to be modified from other classes.
     * @param last modifies the last name.
     */
    public void setLastName(String last) {
        String name3;
        
        if (last.trim().isEmpty()) {
            last = null;
        } else {
            name3 = last.substring(0, 1).toUpperCase()
                + last.substring(1).toLowerCase();
            lastName = name3;
        }
    }
    
    /**
     * Returns the sum of the lengths of the first, middle, and last names.
     * @return sum of first, middle, and last name lengths.
     */
    public int nameLength() {
        return firstName.length() + middleName.length() + lastName.length();
    }
    
    /**
     * Returns the full name's initials.
     * @return full name initials.
     */
    public String nameInitials() {
        return firstName.substring(0, 1).toUpperCase()
                + middleName.substring(0, 1).toUpperCase()
                + lastName.substring(0, 1).toUpperCase();
    }
    
    /**
     * Returns a character from the full name at the nth position.
     * @param n integer specifies nth position.
     * @return character at the nth position
     */
    public char nameSpecificChar(int n) {
        char nExceeds = '@';
        String fullName = firstName + " " + middleName + " " + lastName;
        
        if (n >= fullName.length()) {
            return nExceeds;
        } else {
            return fullName.charAt(n);
        }
    }
    
    /**
     * Returns fullname with the last name first, then first and middle names.
     * @return an alternate full name format.
     */
    public String fullNameAlt() {
        return lastName + ", " + firstName + " " + middleName;
    }
    
    /**
     * Returns true if the accepted string is the same as the first name.
     * @param isFirstName is compared to firstName string.
     * @return true if accepted string equals the first name.
     */
    public boolean isFirstName(String isFirstName) {
        return isFirstName.equals(firstName);
    }
    
    /**
     * Returns true if the three parts of the name object are the same as this
     * particular name object.
     * @param isFullName evaluates to true if input name is same as stored name.
     * @return true if input is same as stored.
     */
    public boolean isFullName(Name isFullName) {
        return this.firstName.equals(isFullName.firstName) 
                && this.middleName.equals(isFullName.middleName)
                && this.lastName.equals(isFullName.lastName);
    }
    
    /**
     * Returns the full name.
     * @return full name of string
     */
    public String toString() {
        String result = firstName + " " + middleName + " "
                + lastName;
        
        return result;
    }
}
    

