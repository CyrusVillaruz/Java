package q1;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Student {
    /** Constant integer that represents the number 3. */
    public static final double THREE = 3.0;
    
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** Stores the score of test 1. */
    private int test1;
    
    /** Stores the score of test 2. */
    private int test2;
    
    /** Stores the score of test 3. */
    private int test3;
    
    /** Stores the average score of students' tests. */
    private double averageScore;
    
    /**
     * Constructs a Student Object that sets the test values to 0.
     */
    public Student() {
        firstName = null;
        lastName = null;
        homeAddress = null;
        schoolAddress = null;
        test1 = 0;
        test2 = 0;
        test3 = 0;
        averageScore = (double) (test1 + test2 + test3) / THREE;
    }

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param t1 integer representing test 1.
     * @param t2 integer representing test 2.
     * @param t3 integer representing test 3.
     */
    public Student(String first, String last, Address home, Address school,
            int t1, int t2, int t3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = t1;
        test2 = t2;
        test3 = t3;
        averageScore = (test1 + test2 + test3) / THREE;
    }
    
    /**
     * Sets the test score for each test.
     * @param testNum the test number to set a score.
     * @param testScore the score to set.
     */
    public void setTestScore(int testNum, int testScore) 
            throws IllegalArgumentException {
        final int upperBound = 100;
        if (testScore < 0 || testScore > upperBound) {
            throw new IllegalArgumentException("Invalid test score.");
        } else {
            if (testNum == 1) {
                test1 = testScore;
            } else if (testNum == 2) {
                test2 = testScore;
            } else if (testNum == THREE) {
                test3 = testScore;
            }
        }
    }
    
    /**
     * Returns the test score.
     * @param testNum the test number to check.
     * @return the test score of a test, with 0 as the default case.
     */
    public double getTestScore(int testNum) {
        if (testNum == 1) {
            return test1;
        } else if (testNum == 2) {
            return test2;
        } else if (testNum == THREE) {
            return test3;
        } else {
            return 0;
        }
    }
    
    /**
     * Returns the average score of the tests.
     * @return average score of tests.
     */
    public double getAverage() {
        averageScore = (double) (test1 + test2 + test3) / THREE;
        return averageScore;
    }

    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;
        result += "\nTest 1: " + test1 + "\n";
        result += "Test 2: " + test2 + "\n";
        result += "Test 3: " + test3 + "\n";
        result += "Average Score: " + getAverage() + "\n";

        return result;
    }
}

