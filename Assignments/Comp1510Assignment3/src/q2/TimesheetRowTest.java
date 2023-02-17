package q2;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TimesheetRowTest.
 * Tests methods in the TimesheetRow class.
 *
 * @author cyrus
 * @version 1.0
 */
public class TimesheetRowTest {
    private final float[] row1 = {3.2f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 5.0f};
    private final float[] row2 = {-2.3f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 5.0f};
    private final float[] row3 = {3.2f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 25.4f};
    private final long hours = (long) (3.2f * 10) 
            | ((long) (1.1f * 10) << 8)
            | ((long) (4.5f * 10) << 16)
            | ((long) (5.5f * 10) << 24)
            | ((long) (3.2f * 10) << 32)
            | ((long) (2.0f * 10) << 40)
            | ((long) (5.0f * 10) << 48);
    private Timesheet timeSheetTest1;
    private Timesheet timeSheetTest2;
    private TimesheetRow timeSheetRowTest1;

    @BeforeEach
    public void setUp() {
        timeSheetTest1 = new Timesheet("TEST", LocalDate.of(2022, 11,25));
        timeSheetTest2 = new Timesheet();
        timeSheetTest1.addRow(new TimesheetRow());
        timeSheetRowTest1 = new TimesheetRow(1510, "TEST", row1);
        timeSheetTest2.addRow(timeSheetRowTest1);
    }
    
    @Test
    public void testConstructor() {
        assertThrows(IllegalArgumentException.class,
                () -> {new TimesheetRow(1510, "TEST", row2);},
                "Invalid Hour.");
        assertThrows(IllegalArgumentException.class,
                () -> {new TimesheetRow(1510, "TEST", row3);},
                "Invalid Hour.");
    }
    
    @Test
    public void testGetHour() {
        assertEquals(row1[0], timeSheetRowTest1.getHour(0));
        assertEquals(row1[1], timeSheetRowTest1.getHour(1));
        assertEquals(row1[2], timeSheetRowTest1.getHour(2));
        assertEquals(row1[3], timeSheetRowTest1.getHour(3));
        assertEquals(row1[4], timeSheetRowTest1.getHour(4));
        assertEquals(row1[5], timeSheetRowTest1.getHour(5));
        assertEquals(row1[6], timeSheetRowTest1.getHour(6));
        assertThrows(IllegalArgumentException.class,
                () -> {timeSheetRowTest1.getHour(7);},
                "Invalid Day of Week");
        assertThrows(IllegalArgumentException.class,
                () -> {timeSheetRowTest1.getHour(-1);},
                "Invalid Day of Week");
    }
    @Test
    public void testSetHour() {
        timeSheetRowTest1.setHour(0, 10.4f);
        assertEquals(10.4f, timeSheetRowTest1.getHour(0));
        assertThrows(IllegalArgumentException.class,
                () -> {timeSheetRowTest1.setHour(7, 5f);},
                "Invalid Day or Hour.");
        assertThrows(IllegalArgumentException.class,
                () -> {timeSheetRowTest1.setHour(-1, 5f);},
                "Invalid Day or Hour.");
        assertThrows(IllegalArgumentException.class,
                () -> {timeSheetRowTest1.setHour(3, -1f);},
                "Invalid Day or Hour.");
        assertThrows(IllegalArgumentException.class,
                () -> {timeSheetRowTest1.setHour(6, 25f);},
                "Invalid Day or Hour.");
        
    }
    
    @Test
    public void testSetProject() {
        timeSheetRowTest1.setProject(2510);
        assertEquals(2510, timeSheetRowTest1.getProject());
    }
    
    @Test
    public void testSetWorkPackage() {
        timeSheetRowTest1.setWorkPackage("DONE");
        assertEquals("DONE", timeSheetRowTest1.getWorkPackage());
    }
    
    @Test
    public void testSetHours() {
        timeSheetRowTest1.setHours(hours);
        assertEquals(hours, timeSheetRowTest1.getHours());
    }
    
    @Test
    public void testToString() {
        final int upperBound = 7;
        String str = "";
        for (int i = 0; i < upperBound; i++) {
            str += " " + timeSheetRowTest1.getHour(i);
        }
        assertEquals("Project Number: " + timeSheetRowTest1.getProject() + " Work Package: " 
                + timeSheetRowTest1.getWorkPackage()
                + " Hours:" + str + "\n", timeSheetRowTest1.toString());
    }
}
