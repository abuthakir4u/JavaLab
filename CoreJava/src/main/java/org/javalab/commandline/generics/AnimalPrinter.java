package org.javalab.commandline.generics;

public class AnimalPrinter<T extends Animal> {
    T thingToPrint;
    public AnimalPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        //Since we are extending Animal in generics we can sure that the object will have eat method from parent Animal
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }

}
