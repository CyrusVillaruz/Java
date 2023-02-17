package q2;

import java.util.List;
import java.util.ArrayList;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Timesheet.
 * This class contains data from a TimesheetRow, and has an end date being
 * a Friday.
 *
 * @author cyrus
 * @version 1.0
 */
public class Timesheet {
    
    /** Represent the employee number. */
    private String empNum;
    
    /** Stores a number of TimesheetRow objects. */
    private List<TimesheetRow> details;
    
    /** Represents the end date, which is Friday. */
    private LocalDate endWeek;
    
    /**
     * Constructor that initializes a Timesheet object with given parameters.
     * @param employeeNum the employee number.
     * @param endOfWeek the end of the week, throws exception if not a Friday.
     */
    public Timesheet(String employeeNum, LocalDate endOfWeek) {
        this.empNum = employeeNum;
        this.endWeek = endOfWeek;
        this.details = new ArrayList<TimesheetRow>();
        if (endWeek.getDayOfWeek().toString().equals("FRIDAY")) {
            this.endWeek = endOfWeek;
        } else {
            // Set end week to next friday.
            this.endWeek = endOfWeek.with(TemporalAdjusters.next(
                    DayOfWeek.FRIDAY));
        }
    }
    
    /**
     * Constructor that initializes instance variables to default values.
     */
    public Timesheet() {
        this.details = new ArrayList<TimesheetRow>();
        this.empNum = null;
        this.endWeek = null;
    }

    /**
     * Return employee number.
     * @return the empNum.
     */
    public String getEmpNum() {
        return empNum;
    }

    /**
     * Sets the given employee number in the Timesheet.
     * @param empNum the empNum to set.
     */
    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    /**
     * Return all TimesheetRow objects' information.
     * @return the details
     */
    public List<TimesheetRow> getDetails() {
        return details;
    }

    /**
     * Sets the TimesheetRow objects in the Timesheet.
     * @param details the details to set
     */
    public void setDetails(List<TimesheetRow> details) {
        this.details = details;
    }

    /**
     * Returns the end week.
     * @return the endWeek
     */
    public LocalDate getEndWeek() {
        return endWeek;
    }

    /**
     * Sets the end of the week, which should be a Friday. If it is not
     * a Friday, then throw exception.
     * @param endOfWeek the endWeek to set
     */
    public void setEndWeek(LocalDate endOfWeek) 
            throws IllegalArgumentException {
        if (endOfWeek.getDayOfWeek().toString().equals("FRIDAY")) {
            this.endWeek = endOfWeek;
        } else {
            throw new IllegalArgumentException(
                    "End of the week should be Friday.");
        }
    }
    
    /**
     * Adds a TimesheetRow object to the details List.
     * @param row the object to add.
     */
    public void addRow(TimesheetRow row) {
        details.add(row);
    }

    /**
     * Returns Timesheet data as a string.
     * @return as string.
     */
    public String toString() {
        return "Timesheet: [Employee Number: " + empNum + ", End Week: " 
                + endWeek + "]" 
                + "\nTimesheet rows:\n" + details;
    }

    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int testYear = 2022;
        final int testMonth = 11;
        final int testDay = 25;
        
        final int testProjectNum = 1510;
        
        // Hours are from Saturday to Friday.
        final float[] hours = {3.2f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 5.0f};
        
        Timesheet timeSheet = new Timesheet("A01321323", 
                LocalDate.of(testYear, testMonth, testDay));
        
        // Testing exception
        //Timesheet ts = new Timesheet("146", LocalDate.of(
        //    testYear, testMonth, testDay + 1));
        
        timeSheet.addRow(new TimesheetRow(testProjectNum, "Assignment3",
                hours));
        timeSheet.addRow(new TimesheetRow());
        timeSheet.addRow(new TimesheetRow());
        System.out.println(timeSheet);
    }

}
