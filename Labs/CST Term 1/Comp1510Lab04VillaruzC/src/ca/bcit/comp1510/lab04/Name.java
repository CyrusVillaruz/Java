/**
 * 
 */

package ca.bcit.comp1510.lab04;

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
        first = first.substring(0, 1).toUpperCase()
                + first.substring(1);
        firstName = first;
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
        middle = middle.substring(0, 1).toUpperCase()
                + middle.substring(1);
        middleName = middle;
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
        last = last.substring(0, 1).toUpperCase()
                + last.substring(1);
        lastName = last;
        
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
    

