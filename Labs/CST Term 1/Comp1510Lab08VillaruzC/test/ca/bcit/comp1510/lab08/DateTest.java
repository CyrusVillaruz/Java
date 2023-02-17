package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTest {
    private Date dateTest;
    
    @BeforeEach
    public void setUp() throws Exception {
        dateTest = new Date(19, 4, 2004);
    }

    @Test
    public void testIsMonthValid() {
        assertFalse(Date.isMonthValid(0));
        assertTrue(Date.isMonthValid(1));
        assertTrue(Date.isMonthValid(2));
        assertTrue(Date.isMonthValid(3));
        assertTrue(Date.isMonthValid(4));
        assertTrue(Date.isMonthValid(5));
        assertTrue(Date.isMonthValid(6));
        assertTrue(Date.isMonthValid(7));
        assertTrue(Date.isMonthValid(8));
        assertTrue(Date.isMonthValid(9));
        assertTrue(Date.isMonthValid(10));
        assertTrue(Date.isMonthValid(11));
        assertTrue(Date.isMonthValid(12));
        assertFalse(Date.isMonthValid(13));
    }

    @Test
    public void testIsYearValid() {
        assertTrue(Date.isYearValid(2020));
        assertFalse(Date.isYearValid(200));
        assertFalse(Date.isYearValid(9999));
    }

    @Test
    public void testIsLeapYear() {
        assertTrue(Date.isLeapYear(1592));
        assertTrue(Date.isLeapYear(1600));
        assertFalse(Date.isLeapYear(1700));
        assertFalse(Date.isLeapYear(1594));
    }

    @Test
    public void testIsDateValid() {
        assertFalse(Date.isDateValid(1, 0, 2000));
        assertFalse(Date.isDateValid(1, 1, 15000));
        assertFalse(Date.isDateValid(0, 5, 1582));
        assertFalse(Date.isDateValid(29, 2, 1582));
        assertFalse(Date.isDateValid(15, 2, 1582));
        assertTrue(Date.isDateValid(23, 5, 1582));
        assertTrue(Date.isDateValid(30, 3, 2020));
        assertTrue(Date.isDateValid(24, 2, 1582));
    }
    
    @Test
    public void testDaysInMonth1() {
        assertEquals(28, Date.daysInMonth(2, false));
        assertEquals(29, Date.daysInMonth(2, true));
    }
    
    @Test
    public void testDaysInMonth2() {
        assertEquals(30, Date.daysInMonth(4, true));
        assertEquals(31, Date.daysInMonth(1, false));
        assertEquals(31, Date.daysInMonth(3, true));
        assertEquals(31, Date.daysInMonth(5, false));
        assertEquals(31, Date.daysInMonth(7, true));
        assertEquals(31, Date.daysInMonth(8, true));
        assertEquals(31, Date.daysInMonth(10, false));
        assertEquals(31, Date.daysInMonth(12, false));
    }
    
    @Test
    public void testDaysInMonth3() {
        assertEquals(0, Date.daysInMonth(13, false));
    }
    
    @Test
    public void testIsDayValid() {
        assertTrue(Date.isDayValid(24, 31));
        assertFalse(Date.isDayValid(0, 30));
    }

    @Test
    public void testConstructor() throws Exception {
       assertThrows(Exception.class,
               ()-> {new Date(31, 12, 3700);},
               "Date is not valid.");
    }

    @Test
    public void testGettersAndSetters() {
        dateTest.setDay(23);
        dateTest.setMonth(6);
        dateTest.setYear(2027);
        assertEquals(23, dateTest.getDay());
        assertEquals(6, dateTest.getMonth());
        assertEquals(2027, dateTest.getYear());
    }
    
}