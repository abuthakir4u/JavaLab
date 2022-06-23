package org.example.MethodOverloading;

public class Example2 {
    public static void main(String[] args) {
        double calculatedCms = calcFeetAndInchesToCentimeters(5, 10);
        calcFeetAndInchesToCentimeters(13);
        System.out.println(calculatedCms);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        double feetToCm = (feet * 12) * 2.54;
        double inchesToCm = inches * 2.54;
        return (feetToCm + inchesToCm);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
