package q2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TimesheetTest.
 * Tests methods in the Timesheet class.
 *
 * @author cyrus
 * @version 1.0
 */
public class TimesheetTest {
    private Timesheet timeSheetTest1;
    private Timesheet timeSheetTest2;
    private Timesheet timeSheetTest3;
    private LocalDate localDateTest1;
    private LocalDate localDateTest2;
    private LocalDate localDateTest3;
    private List<TimesheetRow> detailsTest;
    
    @BeforeEach
    public void setUp() {
        timeSheetTest1 = new Timesheet("TEST", LocalDate.of(2022, 11,25));
        timeSheetTest2 = new Timesheet();
        timeSheetTest3 = new Timesheet("TEST", LocalDate.of(2022, 11, 26));
        timeSheetTest1.addRow(new TimesheetRow());
        localDateTest1 = LocalDate.of(2022, 11, 25);
        localDateTest2 = LocalDate.of(2022, 11, 29);
        localDateTest3 = LocalDate.of(2022, 12, 2);
        detailsTest = new ArrayList<TimesheetRow>();
    }
    
    @Test
    public void testConstructor() {
        assertEquals(null, timeSheetTest2.getEndWeek());
        assertEquals(localDateTest3, timeSheetTest3.getEndWeek());
    }
    
    @Test
    public void testSetEndWeek() {
        timeSheetTest1.setEndWeek(localDateTest1);
        assertEquals(LocalDate.of(2022, 11, 25), timeSheetTest1.getEndWeek());
        assertThrows(IllegalArgumentException.class,
                () -> {timeSheetTest1.setEndWeek(localDateTest2);},
                "End of the week should be Friday.");
    }
    
    @Test
    public void testSetDetails() {
        timeSheetTest1.setDetails(detailsTest);
        assertEquals(detailsTest, timeSheetTest1.getDetails());
    }
    
    @Test
    public void testSetEmpNum() {
        timeSheetTest1.setEmpNum("DONE");
        assertEquals("DONE", timeSheetTest1.getEmpNum());
    }
    
    @Test
    public void testToString() {
        assertEquals("Timesheet: [Employee Number: " + timeSheetTest1.getEmpNum() + ", End Week: " 
                + timeSheetTest1.getEndWeek() + "]" 
                + "\nTimesheet rows:\n" + timeSheetTest1.getDetails(), timeSheetTest1.toString());
    }
}
