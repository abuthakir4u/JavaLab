package org.example.DataTypes;

public class Example2 {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMinDoubleValue);
        System.out.println("double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        //If we ignore f from following 5.25 then compiler will throw error, since default the number is considered as double and we cannot assign double into float
        float myFloatValue = 5f;
        //Following casting is necessary since we are using float literal so the default value considered as double
        //Not recommended the casting for float, instead add f at the end
        float myFloatValueNew = (float) 5;
        double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue); //You will see decimal value even though you did not assign like 5.0

        int myIntValue1 = 5 / 3;
        float myFloatValue1 = 5f / 3f;
        double myDoubleValue1 = 5d / 3d;
        System.out.println("myIntValue1 = " + myIntValue1);
        System.out.println("myFloatValue1 = " + myFloatValue1);
        System.out.println("myDoubleValue1 = " + myDoubleValue1);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("kilogram value = " + convertedKilograms);

        double pi = 3.1415927d;
        //Formatted double value
        double formattedDouble = 3_000_000.1_415_9270d;
        System.out.println(pi);
        System.out.println(formattedDouble);

    }
}
