package org.example.Exercise;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            boolean isLeepYear;
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                isLeepYear = true;
            } else {
                isLeepYear = false;
            }
            return isLeepYear;
        }
    }
}