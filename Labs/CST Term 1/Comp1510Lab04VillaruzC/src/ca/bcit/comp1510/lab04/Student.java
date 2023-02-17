/**
 * 
 */

package ca.bcit.comp1510.lab04;

/**
 * Student.
 * A program that contains student details.
 * @author cyrus
 * @version 1.0
 */
public class Student {
    
    /**
     * String that hold first name.
     */
    private String firstName;
    
    /**
     * String that hold last name.
     */
    private String lastName;
    /**
     * Int that holds student's year of birth.
     */
    
    private int birthYear;
    
    /**
     * String that holds the student number.
     */
    private String studentNumber;
    
    /**
     * Double that holds the student's GPA.
     */
    private int gradePointAverage;
    
    /**
     * Student constructor assigns private instance variables with respective
     * parameters.
     * @param nameFirst stores student's first name.
     * @param nameLast stores student's last name.   
     * @param yearOfBirth stores student's birth year.
     * @param stuNumber stores student's student number.
     * @param gradeAverage stores student's grade average.
     */
    public Student(String nameFirst, String nameLast, int yearOfBirth,
            String stuNumber, int gradeAverage) {
        firstName = nameFirst;
        lastName = nameLast;
        birthYear = yearOfBirth;
        studentNumber = stuNumber;
        gradePointAverage = gradeAverage;
    }

    /**
     * Returns the student's first name.
     * @return student's first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Allows firstName to be modified from other classes.
     * @param fName modifies the first name
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }
    
    /**
     * Returns the student's last name.
     * @return student's last name.
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Allows lastName to be modified from other classes.
     * @param lName modifies the last name
     */
    public void setLastName(String lName) {
        lastName = lName;
    }
    
    /**
     * Returns the student's birth year.
     * @return student's birth year.
     */
    public int getBirthYear() {
        return birthYear;
    }
    
    /**
     * Allows birthYeare to be modified from other classes.
     * @param yearOfBirth modifies the birth year.
     */
    public void setBirthYear(int yearOfBirth) {
        birthYear = yearOfBirth;
    }
    
    /**
     * Returns the student's student number.
     * @return student's student number.
     */
    public String getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * Allows studentNumber to be modified from other classes.
     * @param studentNum modifies the student number.
     */
    public void setStudentNumber(String studentNum) {
        studentNumber = studentNum;
    }
    
    /**
     * Returns the student's grade average.
     * @return student's grade average.
     */
    public double getGradeAverage() {
        return gradePointAverage;
    }
    
    /**
     * Allows gradePointAverage to be modified from other classes.
     * @param averageGrade modifies the grade average.
     */
    public void setGradeAverage(int averageGrade) {
        gradePointAverage = averageGrade;
    }
    
    /**
     * Outputs the student's first name, last name, birth year,
     * student number, and their grade average as a string.
     * @return student's details.
     */
    public String toString() {
        String result = firstName + " " + lastName + " "
                + birthYear + " " + studentNumber + " "
                + gradePointAverage;
        
        return result;

    }

}
