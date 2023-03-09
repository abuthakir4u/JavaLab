package org.javalab.commandline.generics;

public class MultiGenPrinter <T, V>{
    T thingsToPrint;
    V otherThingToPrint;

    public MultiGenPrinter(T thingsToPrint, V otherThingToPrint) {
        this.thingsToPrint = thingsToPrint;
        this.otherThingToPrint = otherThingToPrint;
    }
}
