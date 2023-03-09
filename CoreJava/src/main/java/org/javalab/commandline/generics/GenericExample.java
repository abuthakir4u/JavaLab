package org.javalab.commandline.generics;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(23);
        integerPrinter.print();

        StringPrinter stringPrinter = new StringPrinter("test value");
        stringPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(12.12);
        doublePrinter.print();

        Printer<Integer> p1 = new Printer<Integer>(100);
        //Can have empty <> in object creation as below
        //Printer<Integer> printer = new Printer<>(100);
        p1.print();

        Printer<Double> p2 = new Printer<>(100.12);
        p2.print();


        //Generic in collection

        ArrayList<String> names = new ArrayList<>();
        names.add("test1");
        names.add("test2");
        //The following will throw compile time error since you are passing wrong type, so Generic is type safe
        //names.add(1212);

        //we can use the Object as type to accept all type, but it won't be type safe. So the following code works but not recommended
        ArrayList<Object> x = new ArrayList<>();
        x.add(20);
        Integer val = (Integer) x.get(0);

        //So with the above code you can add any object to the ArrayList and it won't through any error at casting even though you add String and trying to cast as Integer
        //While in run time you will get the error


        AnimalPrinter<Cat> catePrinter = new AnimalPrinter<Cat>(new Cat());
        AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<Dog>(new Dog());

        shout("John", 71);
        shout(100, "run");
        shout(new Cat(), "xyz");

    }

    private static <T, V> void shout (T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!!!!");
    }
}
