package org.example.Exercise;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        int number1InInteger = (int) (number1 * 1000);
        int number2InInteger = (int) (number2 * 1000);
        System.out.println(number1InInteger);
        System.out.println(number2InInteger);

        if (number1InInteger == number2InInteger) {
            return true;
        } else {
            return false;
        }
    }
}
