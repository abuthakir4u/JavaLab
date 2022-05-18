package org.javalab.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        //map example
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        //foreach example
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        //reduce example
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
    }
}
