package q1;

/**
 * Course.
 * This class represents a course that's taken at a school.
 * @author cyrus
 * @version 1.0
 */
public class Course {
    /** Constant integer that represents the number 5. */
    public static final int FIVE = 5;
    
    /** Tracks the number of students. */
    private int numOfStudents;
    
    /** Stores the course name. */
    private String courseName;
    
    /** Stores the number of students. */
    private Student[] students;
    
    /**
     * Contructs a course object that contains the course name.
     * @param name the course name.
     */
    public Course(String name) {
        courseName = name;
        numOfStudents = 0;
        students = new Student[FIVE];
    }
    
    /**
     * Adds a student to the course, as long as it's not full.
     * @param s the student to add.
     */
    public void addStudent(Student s) throws IllegalArgumentException {
        if (numOfStudents < FIVE) {
            students[numOfStudents] = s;
            numOfStudents++;
        } else {
            throw new IllegalArgumentException("This course is full!");
        }
    }
    
    /**
     * Calculates the average score for each student.
     * @return the average score of each student.
     */
    public double average() {
        double averageScore = 0.0;
        for (int i = 0; i < numOfStudents; i++) {
            averageScore += students[i].getAverage();
        }
        
        averageScore /= numOfStudents;
        return averageScore;
    }
    
    /**
     * Prints all the students in the course.
     */
    public void role() {
        System.out.println("Students in " + courseName + ":\n");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());
        }
    }
}
