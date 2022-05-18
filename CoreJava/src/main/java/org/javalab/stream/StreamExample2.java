package org.javalab.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println("square: " + square);

        // create a list of String
        List<String> names =
                Arrays.asList("India", "Come", "Test");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("T")).
                collect(Collectors.toList());
        System.out.println("filtered list: " + result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println("soted show" + show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println("collector as set output: " + squareSet);

        // demonstration of forEach method
        System.out.print("forEach example: ");
        number.stream().map(x -> x * x).forEach(y -> System.out.print(y + " "));
        System.out.println();

        // demonstration of reduce method
        int even =
                number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println("reduce example: " + even);

        int evenWithInitialValueAdded =
                number.stream().filter(x -> x % 2 == 0).reduce(10, (ans, i) -> ans + i);
        System.out.println("reduce example with initial value added: " + evenWithInitialValueAdded);
    }
}
