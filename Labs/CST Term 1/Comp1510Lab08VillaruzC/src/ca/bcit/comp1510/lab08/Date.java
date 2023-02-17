package ca.bcit.comp1510.lab08;

import java.util.Scanner;

/**
 * Date.
 * Represent a valid Gregorian date on or after 24 February 1582
 * @author blink
 * @version 1.0
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    /**
     * Constructor that initializes the parameter 
     * values if a given date is valid.
     * 
     * @param theDay stores the day.
     * @param theMonth stores the month.
     * @param theYear stores the year.
     * @throws Exception if a given date is invalid.
     */
    public Date(int theDay, int theMonth, int theYear) throws Exception {
        // fill this code in and only store a valid date.  
        // throw exception if parameters are not a valid date
        if (isDateValid(theDay, theMonth, theYear)) {
            this.day = theDay;
            this.month = theMonth;
            this.year = theYear;
        } else {
            throw new Exception("Date is not valid.");
        }
    }
    
    /**
     * Returns the year.
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Allows the year to be modified by other classes.
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the month.
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Allows the month to be modified by other classes.
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Returns the day.
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Allows the day to be modified by other classes.
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }
    
    /**
     * Checks if given day is valid.
     * @param day the day to check.
     * @param maxDaysInMonth the max number of days to check in a month.
     * @return true if the given day is within acceptable range for
     *      the specified month; false otherwise.
     */
    public static boolean isDayValid(int day, int maxDaysInMonth) {
        return (day <= maxDaysInMonth && day > 0);

    }
    
    /**
     * Checks if given month is valid.
     * @param m the month to check.
     * @return true if the given month is within acceptable range;
     *      false otherwise;
     */
    public static boolean isMonthValid(int m) {
        final int monthUpperBound = 12;
        return (m >= 1 && m <= monthUpperBound);
    }
    
    /**
     * Checks if given year is valid.
     * @param year the year to check
     * @return true if the given year is within acceptable range;
     *      false otherwise.
     */
    public static boolean isYearValid(int year) {
        final int yearUpperBound = 2999;
        final int yearLowerBound = 1582;
        return year >= yearLowerBound && year <= yearUpperBound;
    }
    
    /**
     * Checks if a given year is a leap year.
     * @param year the year to check.
     * @return true if leap year; false otherwise.
     */
    public static boolean isLeapYear(int year) {
        final int divisibleByFour = 4;
        final int divisibleByFourHundred = 400;
        final int divisibleByOneHundred = 100;
        
        if (year % divisibleByFour == 0) {
            if (year % divisibleByOneHundred == 0) {
                return (year % divisibleByFourHundred == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    } 
    
    /**
     * Returns the number of days in a given month, and 0 if the given
     * month is invalid.
     * 
     * @param month the month to check.
     * @param isLeapYear if given year is a leap year.
     * @return number of days in a given month; 0 if month is invalid.
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        final int three = 3;
        final int five = 5;
        final int seven = 7;
        final int eight = 8;
        final int ten = 10;
        final int twelve = 12;
        
        final int maxDaysInJanuary = 31;
        final int maxDaysInFebruaryLeapYear = 29;
        final int maxDaysInFebruary = 28;
        final int maxDaysInApril = 30;
        
        if (isMonthValid(month)) {
            if (month == 1 || month == three || month == five || month == seven 
                    || month == eight || month == ten || month == twelve) {
                return maxDaysInJanuary;
            } else if (month == 2) {
                if (isLeapYear) {
                    return maxDaysInFebruaryLeapYear;
                } else {
                    return maxDaysInFebruary;
                }
            } else {
                return maxDaysInApril;
            }
        } else {
            return 0;
        }
    }
    
    /**
     * Checks if a given date is valid. If the date is not earlier than
     * February 24, 1582, then the method will check if the date is not later
     * than the year of 2999; returning true if it is the case. In the case of
     * leap years, 
     * 
     * @param day the day to check.
     * @param month the month to check.
     * @param year the year to check.
     * @return true if the above parameters are valid.
     */
    public static boolean isDateValid(int day, int month, int year) {
        final int yearLowerBound = 1582;
        final int minValidDay = 24;
        if (!(year <= yearLowerBound && month <= 2 && day < minValidDay)) {
            return (isYearValid(year) 
                    && isMonthValid(month) 
                    && isDayValid(
                    day, daysInMonth(month, isLeapYear(year))));
        }
        return false;
    }
    
    /**
     * Drives the program.
     * 
     * @param args unused.
     * @throws Exception  if date is invalid.
     */
    public static void main(String[] args) throws Exception { 
        //date read in from user
        int month;
        int day;
        int year;
        //true if parts of input from user is valid
        boolean monthValid;
        boolean dayValid;
        boolean yearValid;
        
        //number of days in month read in
        int daysInMonth;
        //true if user's year is a leap year
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user
        System.out.println("Enter a year: ");
        year = scan.nextInt();
        System.out.println("Enter a month: ");
        month = scan.nextInt();
        System.out.println("Enter a day: ");
        day = scan.nextInt();
        //Use the methods to check to see if month is valid
        monthValid = isMonthValid(month);
        //Use the methods to check to see if year is valid
        yearValid = isYearValid(year);
        //Use the methods to determine whether it's a leap year
        leapYear = isLeapYear(year);
        //Use the methods to determine number of days in month
        daysInMonth = daysInMonth(month, leapYear);
        //Use the methods to see if day is valid
        dayValid = isDayValid(day, daysInMonth);
        //Use the methods to determine whether date is valid
        //   and print appropriate message
        if (isDateValid(day, month, year)) {
            System.out.println("Date is valid.");
            if (isLeapYear(year)) {
                System.out.println("This year is a leap year.");
            }
        } else {
            throw new Exception("Date is not valid.");
        }
        //Create a Date object with month, day, year
        Date date = new Date(day, month, year);
    } 
    
    /*
     * Q7: All methods in the main method can be replaced by simply
     * creating a Date object created by the constructor. 
     * However, if you want to check if a specific day, month, or
     * year is valid and is a leap year, then you will
     * have to use the main method.
     */
} 
