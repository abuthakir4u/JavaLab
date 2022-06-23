package org.example.Operators;

public class Example2 {
    public static void main(String[] args){
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double result = (myFirstDouble + mySecondDouble) * 100.00;
        double newResult = result % 40.00d;
        boolean myBoolean = newResult == 0 ? true : false;
        System.out.println("myBoolean = " + myBoolean);
        if (!myBoolean) {
            System.out.println("Got some remainder");;
        }
    }
}
