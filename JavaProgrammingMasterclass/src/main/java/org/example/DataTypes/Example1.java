package org.example.DataTypes;

public class Example1 {
    public static void main(String[] args) {
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //Example of overflow/underflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 2));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        //It won't allow to assign integer literal greater than max allowed value
        //int myMaxIntTest = 2147483648;

        //Formatted integer literal assignment. It is allowed from Java 7 and above
        int formattedIntValue = 10_000;
        System.out.println(formattedIntValue);

        //byte data type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        //short data type
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        //long data type
        //Long literal will have L at end
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);
        //If wwe did not add L at last the number will be considered and following assignment will show error since it exceeds maximum allowed integer value
        //long bigLongLiteralValue = 2147483648;

        int myTotal = (myMinIntValue / 2);

        //Without casting compiler will throw error
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        //Bigger data type variable can hold smaller data type value
        long longVariable = 10L;
        longVariable = myMaxByteValue;
        longVariable = myMaxShortValue;
        longVariable = myMaxIntValue;

        int intVariable = 100;
        intVariable = myMaxByteValue;
        intVariable = myMaxShortValue;

        short shortVariable = 10;
        shortVariable = myMaxByteValue;

    }
}
