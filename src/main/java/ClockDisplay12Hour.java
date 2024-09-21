package src.main.java;


public class ClockDisplay12Hour
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
    
    private NumberDisplay hourDisplay;
    private NumberDisplay minuteDisplay;
    private String formattedTime;
    private String periodIndicator;

    public ClockDisplay12Hour() {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        periodIndicator = "AM";
        updateTimeDisplay();
    }

    public ClockDisplay12Hour(int hours, int minutes, String amPm) {
        hourDisplay = new NumberDisplay(24);
        minuteDisplay = new NumberDisplay(60);
        setClockTime(hours, minutes, amPm);
        updateTimeDisplay();
    }

    public void advanceTime() {
        minuteDisplay.increment();
        if (minuteDisplay.getValue() == 0) {
            hourDisplay.increment();
        }
        if (hourDisplay.getValue() == 12 && minuteDisplay.getValue() == 0) {
            togglePeriod();
        }
        updateTimeDisplay();
    }

    private void togglePeriod() {
        if (periodIndicator.equals("AM")) {
            periodIndicator = "PM";
        } else {
            periodIndicator = "AM";
        }
    }

    public void setClockTime(int hours, int minutes, String amPm) {
        periodIndicator = amPm;
        minuteDisplay.setValue(minutes);
        hourDisplay.setValue(hours);
        updateTimeDisplay();
    }

    public String getTime() {
        return formattedTime;
    }

    private void updateTimeDisplay() {
        String timeString = hourDisplay.getDisplayValue() + ":" + minuteDisplay.getDisplayValue();
        formattedTime = timeString + periodIndicator;
    }
}

