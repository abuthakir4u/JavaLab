package org.example.Exercise;

public class Main {
    public static void main(String[] args) {
        long l = SpeedConverter.toMilesPerHour(10);
        System.out.println(l);

        SpeedConverter.printConversion(10);
    }
}
