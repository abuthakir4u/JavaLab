package org.javalab.commandline.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardSample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        //printList(intList); --> This will throw compile time error since it does not extend Animal

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
    }

    private static void printList(List<? extends  Animal> myList) {
        System.out.println(myList);
    }
}
