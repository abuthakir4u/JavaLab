package org.example.MethodOverloading;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long yearInMinutes = 365 * 24 * 60;
            long dayInMinutes = 24 * 60;

            long years = minutes / yearInMinutes;
            long days = (minutes % yearInMinutes) / dayInMinutes;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
