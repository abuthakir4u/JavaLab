package org.example.MethodOverloading;


public class Example3 {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long calHours = minutes / 60;
        long calMinutes = minutes % 60;
        String hoursString = calHours + "h ";
        if (calHours < 10) {
            hoursString = "0" + hoursString;
        }
        String minuteString = calMinutes + "m ";
        if (calMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondString = seconds + "s";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + minuteString + secondString;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long calMinutes = seconds / 60;
        long calSeconds = seconds % 60;
        return getDurationString(calMinutes, calSeconds);
    }
}
