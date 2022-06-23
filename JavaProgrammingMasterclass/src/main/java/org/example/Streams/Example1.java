package org.example.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) throws IOException {

        // Integer Stream example
        // NOTE: System.out::println --> is method reference
        // range method will create stream of numbers from 1 to 10 (excluding 10)
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println("\n-----------------------------\n");

        // skip (intermediate operation) method will skip first n elements
        IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));
        System.out.println("\n-----------------------------\n");

        // sum (terminal operation) method sum all stream elements
        System.out.print(IntStream.range(1, 5).sum());
        System.out.println("\n-----------------------------\n");

        //Stream.of method used to create stream from String, Integer etc
        //sorted (intermediate operation) soring the stream. It will also accept custom comparator
        //findFirst(another intermediate operation) finding the first element from stream
        Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);
        System.out.println("\n-----------------------------\n");

        //Arrays.stream will create stream from array
        //filter (intermediate operation) filter the stream by executing the passed method return value
        //sorted (intermediate operation) soring the stream.
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sams"};
        Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);
        System.out.println("\n-----------------------------\n");

        //map (intermediate operation) will map passed method to each element in stream and update return value in stream
        //average (intermediate operation) calculate the average from the stream element
        Arrays.stream(new int[]{2, 4, 6, 8, 10}).map(x -> x * x).average().ifPresent(System.out::println);
        System.out.println("\n-----------------------------\n");

        //from list created stream using "stream" method
        //map intermediate operation used to map a toLowerCase method to each element in stream
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sams");
        people.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("a")).forEach(System.out::println);
        System.out.println("\n-----------------------------\n");

        //The same above example code with method reference in map method
        people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
        System.out.println("\n-----------------------------\n");

        //Creating stream from file lines with Stream
        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\abuth\\IdeaProjects\\CoreJavaApp\\src\\Streams\\bands.txt"));
        bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
        bands.close();
        System.out.println("\n-----------------------------\n");

        //collect (terminal operation) collect the stream list
        Stream<String> bandStream = Files.lines(Paths.get("C:\\Users\\abuth\\IdeaProjects\\CoreJavaApp\\src\\Streams\\bands.txt"));
        List<String> bandList = bandStream.filter(x -> x.contains("jit")).collect(Collectors.toList());
        System.out.println(bandList);
        System.out.println("\n-----------------------------\n");

        //using map intermediate operation applying split method on each stream element and it will convert stream elements as array
        //using filter intermediate operation checking row with 3 element
        //count terminal operation is used to get count of stream element which is having 3 count array
        Stream<String> rows = Files.lines(Paths.get("C:\\Users\\abuth\\IdeaProjects\\CoreJavaApp\\src\\Streams\\data.txt"));
        long verifiedRowCount = rows.map(x -> x.split(",")).filter(x -> x.length == 3).count();
        System.out.println(verifiedRowCount);
        rows.close();
        System.out.println("\n-----------------------------\n");

        //Same like previous example code
        //Adding extra filter with 2nd element greater than 15
        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\abuth\\IdeaProjects\\CoreJavaApp\\src\\Streams\\data.txt"));
        rows1.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rows.close();
        System.out.println("\n-----------------------------\n");

        //getting output as map using collect terminal operation
        Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\abuth\\IdeaProjects\\CoreJavaApp\\src\\Streams\\data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        rows2.close();
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("\n-----------------------------\n");

        //reduce terminal operation example
        //reduce first argument is both the initial value of the reduction and the default result if there are no elements in the stream
        //reduce second argument is the accumulator function takes two parameters: a partial result of the reduction and the next element of the stream
        //Note: sum terminal operation will accept only integer
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double x, Double currentElement) -> x + currentElement);
        System.out.println(total);
        System.out.println("\n-----------------------------\n");

        //summaryStatistics terminal operation return stats of the integer stream data
        IntSummaryStatistics summary1 = IntStream.of(7, 12, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary1);
        System.out.println("\n-----------------------------\n");

    }
}
