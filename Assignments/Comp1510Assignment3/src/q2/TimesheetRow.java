package q2;

/**
 * TimesheetRow. 
 * This class represents a row of a timesheet.
 *
 * @author cyrus
 * @version 1.0
 */
public class TimesheetRow {

    /** Constant that stores different mask values for bitwise operations. */
    private static final long[] MASK = 
        {0xFFL, 0xFF00L, 0xFF0000L, 0xFF000000L, 0xFF00000000L, 0xFF0000000000L,
            0xFF000000000000L };

    /** Constant that stores different umask values for bitwise operations. */
    private static final long[] UMASK = 
        {0xFFFFFFFFFFFFFF00L, 0xFFFFFFFFFFFF00FFL, 0xFFFFFFFFFF00FFFFL,
            0xFFFFFFFF00FFFFFFL, 0xFFFFFF00FFFFFFFFL, 0xFFFF00FFFFFFFFFFL,
            0xFF00FFFFFFFFFFFFL };

    /** Constant that represents the size of a byte. */
    private static final int BYTESIZE = 8;

    /** Constant that represents the number 10 as an int. */
    private static final int INTTEN = 10;

    /** Constant that represents the number 10 as a float. */
    private static final float FLOATTEN = 10.0f;

    /** Constant that represents maximum amount of hours in a day. */
    private static final int HOURUPPERBOUND = 24;

    /** Represents the project number. */
    private int project;

    /** Represents the work package. */
    private String workPackage;

    /** Stores the number of hours per day in a week. */
    private long hours;

    /**
     * Constructor that initializes a TimesheetRow object with default project,
     * workPackage, and hour values.
     */
    public TimesheetRow() {
        project = 0;
        workPackage = null;
        hours = 0;
    }

    /**
     * Constructor that initializes a TimesheetRow 
     * object with the given parameters.
     * 
     * @param projectNum the project number.
     * @param pack the work package.
     * @param hoursInDay an array of hours from Saturday 
     *      to Friday, in that order.
     */
    public TimesheetRow(int projectNum, String pack,
            float... hoursInDay) throws IllegalArgumentException {
        this.project = projectNum;
        this.workPackage = pack;
        for (int i = 0; i < hoursInDay.length; i++) {
            if (hoursInDay[i] >= 0 && hoursInDay[i] <= HOURUPPERBOUND) {
                hours = (long) (hoursInDay[0] * INTTEN) 
                        | ((long) (hoursInDay[1] * INTTEN) << BYTESIZE)
                        | ((long) (hoursInDay[2] * INTTEN) << (BYTESIZE * 2))
                        | ((long) (hoursInDay[(2 + 1)] * INTTEN) 
                                << (BYTESIZE * (2 + 1)))
                        | ((long) (hoursInDay[(2 + 2)] * INTTEN) 
                                << (BYTESIZE * (2 + 2)))
                        | ((long) (hoursInDay[(2 + 2 + 1)] * INTTEN) 
                                << (BYTESIZE * (2 + 2 + 1)))
                        | ((long) (hoursInDay[(2 + 2 + 2)] * INTTEN)
                                << (BYTESIZE * (2 + 2 + 2)));
            } else {
                throw new IllegalArgumentException("Invalid hour.");
            }
        }
    }
    
    /**
     * Return project number.
     * 
     * @return the project number.
     */
    public int getProject() {
        return project;
    }

    /**
     * Sets the project number to the given integer.
     * 
     * @param project the project to set
     */
    public void setProject(int project) {
        this.project = project;
    }

    /**
     * Return work package.
     * 
     * @return the workPackage.
     */
    public String getWorkPackage() {
        return workPackage;
    }

    /**
     * Sets the work package to the given string.
     * 
     * @param workPackage the workPackage to set
     */
    public void setWorkPackage(String workPackage) {
        this.workPackage = workPackage;
    }

    /**
     * Return hours per day in a week.
     * 
     * @return the hours
     */
    public long getHours() {
        return hours;
    }

    /**
     * Sets the hours to the given long.
     * 
     * @param hours the hours to set
     */
    public void setHours(long hours) {
        this.hours = hours;
    }

    /**
     * Return the hours of given day as a float (0 being Saturday and 6 being
     * Friday).
     * 
     * @param day the day to check.
     * @return hours of a given day.
     */
    public float getHour(int day) throws IllegalArgumentException {
        if (day > (2 + 2 + 2) || day < 0) {
            throw new IllegalArgumentException("Invalid Day of Week.");
        } else {
            return (float) (((hours >> (BYTESIZE * day)) & MASK[0]) / FLOATTEN);
        }
    }

    /**
     * Takes a day of the week and its hours as a float, and sets it to the
     * appropriate byte of the hours variable.
     * 
     * @param day       the day to check.
     * @param hourToSet the hour to set.
     */
    public void setHour(int day, float hourToSet) {
        final int upperBound = 7;
        long setToTheseHours = (long) (hourToSet * FLOATTEN);
        if (day > (2 + 2 + 2) || day < 0 
                || hourToSet < 0 || hourToSet > HOURUPPERBOUND) {
            throw new IllegalArgumentException("Invalid Day or Hour.");
        } else {
            for (int i = 0; i < upperBound; i++) {
                if (i == day) {
                    this.hours = this.hours & UMASK[day];
                    this.hours += setToTheseHours << (i * BYTESIZE);
                }
            }
        }

    }

    /**
     * Return details of TimesheetRow as string.
     * 
     * @return details as string.
     */
    public String toString() {
        final int upperBound = 7;
        String str = "";
        for (int i = 0; i < upperBound; i++) {
            str += " " + (getHour(i));
        }
        return "Project Number: " + project 
                + " Work Package: " + workPackage + " Hours:" + str + "\n";
    }
}
