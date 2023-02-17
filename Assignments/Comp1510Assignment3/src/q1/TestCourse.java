package q1;

/**
 * TestCourse.
 * This class creates a course that adds students to it, as well as
 * print out a roll and and overall test averages.
 *
 * @author cyrus
 * @version 1.0
 */
public class TestCourse {
    /** Constant test score. */
    private static final int S1TEST1 = 84;
    
    /** Constant test score. */
    private static final int S1TEST2 = 97;
    
    /** Constant test score. */
    private static final int S1TEST3 = 65;
    
    /** Constant test score. */
    private static final int S2TEST1 = 82;
    
    /** Constant test score. */
    private static final int S2TEST2 = 90;
    
    /** Constant test score. */
    private static final int S2TEST3 = 67;
    
    /** Constant test score. */
    private static final int S3TEST1 = 100;
    
    /** Constant test score. */
    private static final int S3TEST2 = 0;
    
    /** Constant test score. */
    private static final int S3TEST3 = 50;
    
    /** Constant test score. */
    private static final int S4TEST1 = 55;
    
    /** Constant test score. */
    private static final int S4TEST2 = 88;
    
    /** Constant test score. */
    private static final int S4TEST3 = 53;
    
    /** Constant test score. */
    private static final int S5TEST1 = 86;
    
    /** Constant test score. */
    private static final int S5TEST2 = 60;
    
    /** Constant test score. */
    private static final int S5TEST3 = 75;
    
    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int test123 = 0;
        
        Course math = new Course("Mathematics");
        
        Student s1 = new Student("Cyrus", "Villaruz", 
                new Address("3461 Welwyn Street", "Vancouver",
                "British Columbia", "V5N 3Y8"), new Address(
                "3700 Willingdon Avenue", "Burnaby",
                "British Columbia", "V5G 3H2"), test123, test123, test123);
        s1.setTestScore(1, S1TEST1);
        s1.setTestScore(2, S1TEST2);
        s1.setTestScore((2 + 1), S1TEST3);
        math.addStudent(s1);
        
        Student s2 = new Student("Filler", "Name1",
                new Address("Filler Street", "Filler City", "Filler State",
                "Filler Postal Code"), new Address("Filler Street",
                "Filler City", "Filler State", "Filler Postal Code"),
                test123, test123, test123);
        s2.setTestScore(1, S2TEST1);
        s2.setTestScore(2, S2TEST2);
        s2.setTestScore((2 + 1), S2TEST3);
        math.addStudent(s2);
        
        Student s3 = new Student("Filler", "Name2",
                new Address("Filler Street", "Filler City", "Filler State",
                "Filler Postal Code"), new Address("Filler Street",
                "Filler City", "Filler State", "Filler Postal Code"), 
                test123, test123, test123);
        s3.setTestScore(1, S3TEST1);
        s3.setTestScore(2, S3TEST2);
        s3.setTestScore((2 + 1), S3TEST3);
        math.addStudent(s3);
        
        Student s4 = new Student("Filler", "Name3",
                new Address("Filler Street", "Filler City", "Filler State",
                "Filler Postal Code"), new Address("Filler Street",
                "Filler City", "Filler State", "Filler Postal Code"), 
                test123, test123, test123);
        s4.setTestScore(1, S4TEST1);
        s4.setTestScore(2, S4TEST2);
        s4.setTestScore((2 + 1), S4TEST3);
        math.addStudent(s4);
        
        Student s5 = new Student("Filler", "Name4",
                new Address("Filler Street", "Filler City", "Filler State",
                "Filler Postal Code"), new Address("Filler Street",
                "Filler City", "Filler State", "Filler Postal Code"), 
                test123, test123, test123);
        s5.setTestScore(1, S5TEST1);
        s5.setTestScore(2, S5TEST2);
        s5.setTestScore((2 + 1), S5TEST3);
        math.addStudent(s5);
        
        // Testing exception for adding a 6th student in a 5-student course.
        
        /*Student s6 = new Student("Filler", "Name5",
                new Address("Filler Street", "Filler City", "Filler State",
                "Filler Postal Code"), new Address("Filler Street",
                "Filler City", "Filler State", "Filler Postal Code"), 
                test123, test123, test123);
        s6.setTestScore(1, S5TEST1);
        s6.setTestScore(2, S1TEST2);
        s6.setTestScore((2 + 1), S3TEST3);        
        math.addStudent(s6);*/
        
        // Testing empty Student constructor.
        
        // Student s7 = new Student();
        // math.addStudent(s7);
        
        // Testing exception if score is less than 0 or greater than 100
        
        /*Student s8 = new Student("Filler", "Name4",
                new Address("Filler Street", "Filler City", "Filler State",
                "Filler Postal Code"), new Address("Filler Street",
                "Filler City", "Filler State", "Filler Postal Code"), 
                test123, test123, test123);
        s8.setTestScore(1, -1);
        s8.setTestScore(2, S5TEST2);
        s8.setTestScore((2 + 1), S5TEST3);
        math.addStudent(s8);*/
        
        /*Student s9 = new Student("Filler", "Name4",
                new Address("Filler Street", "Filler City", "Filler State",
                "Filler Postal Code"), new Address("Filler Street",
                "Filler City", "Filler State", "Filler Postal Code"), 
                test123, test123, test123);
        s9.setTestScore(1, 110);
        s9.setTestScore(2, S5TEST2);
        s9.setTestScore((2 + 1), S5TEST3);
        math.addStudent(s9);*/
        
        math.role();
        
        System.out.println("Mathematics Test Average: " + math.average());
    }

}
