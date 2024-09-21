package src.main.java;

public class ClockDriver {
    public static void main(String[] args) {
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00

        ClockDisplay clockA = new ClockDisplay();
        String initialOutput = clockA.getTime();
        System.out.println("Initial output: " + initialOutput);

        ClockDisplay clockB = new ClockDisplay(3, 45);
        String initializedOutput = clockB.getTime();
        System.out.println("Initialized output: " + initializedOutput);

        clockB.setTime(3, 32);
        System.out.println("Before tick: " + clockB.getTime());
        clockB.timeTick();
        System.out.println("After tick: " + clockB.getTime());

        clockB.setTime(3, 9);
        System.out.println("Before tick: " + clockB.getTime());
        clockB.timeTick();
        System.out.println("After tick: " + clockB.getTime());

        clockB.setTime(1, 59);
        System.out.println("Before tick: " + clockB.getTime());
        clockB.timeTick();
        System.out.println("After tick: " + clockB.getTime());

        clockB.setTime(9, 59);
        System.out.println("Before tick: " + clockB.getTime());
        clockB.timeTick();
        System.out.println("After tick: " + clockB.getTime());

        clockB.setTime(23, 59);
        System.out.println("Before tick: " + clockB.getTime());
        clockB.timeTick();
        System.out.println("After tick: " + clockB.getTime());

        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00

        ClockDisplaySeconds clockSec1 = new ClockDisplaySeconds();
        System.out.println("Initial seconds output: " + clockSec1.getTime());

        ClockDisplaySeconds clockSec2 = new ClockDisplaySeconds(3, 45, 23);
        System.out.println("Seconds initialized output: " + clockSec2.getTime());

        clockSec2.setTime(3, 32, 59);
        System.out.println("Before tick: " + clockSec2.getTime());
        clockSec2.timeTick();
        System.out.println("After tick: " + clockSec2.getTime());

        clockSec2.setTime(1, 0, 59);
        System.out.println("Before tick: " + clockSec2.getTime());
        clockSec2.timeTick();
        System.out.println("After tick: " + clockSec2.getTime());

        clockSec2.setTime(1, 59, 59);
        System.out.println("Before tick: " + clockSec2.getTime());
        clockSec2.timeTick();
        System.out.println("After tick: " + clockSec2.getTime());

        clockSec2.setTime(23, 59, 59);
        System.out.println("Before tick: " + clockSec2.getTime());
        clockSec2.timeTick();
        System.out.println("After tick: " + clockSec2.getTime());

        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM

        ClockDisplay12Hour test1 = new ClockDisplay12Hour();
        System.out.println("Empty constructor test - " + test1.getTime());

        ClockDisplay12Hour test2 = new ClockDisplay12Hour(3, 45, "PM");
        System.out.println("Constructor with time test - " + test2.getTime());

        test2.setClockTime(4, 15, "AM");
        System.out.println("Set time test (04:15 AM) - " + test2.getTime());

        test2.setClockTime(3, 32, "PM");
        System.out.println("Before tick (03:32 PM) - " + test2.getTime());
        test2.advanceTime();
        System.out.println("After tick (03:33 PM) - " + test2.getTime());

        test2.setClockTime(11, 59, "PM");
        System.out.println("Before tick (11:59 PM) - " + test2.getTime());
        test2.advanceTime();
        System.out.println("After tick (12:00 AM) - " + test2.getTime());

        test2.setClockTime(11, 59, "AM");
        System.out.println("Before tick (11:59 AM) - " + test2.getTime());
        test2.advanceTime();
        System.out.println("After tick (12:00 PM) - " + test2.getTime());

        test2.setClockTime(12, 59, "PM");
        System.out.println("Before tick (12:59 PM) - " + test2.getTime());
        test2.advanceTime();
        System.out.println("After tick (01:00 PM) - " + test2.getTime());
    }
}
