package org.javalab.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };
        Stream.of(arrayOfEmps).forEach(obj -> System.out.println(obj));
        System.out.println();

        List<Employee> empList = Arrays.asList(arrayOfEmps);
        empList.stream().forEach(obj -> System.out.println(obj));
        System.out.println();

        Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]).forEach(obj -> System.out.println(obj));
        System.out.println();

        Stream.Builder<Employee> sb = Stream.builder();
        sb.accept(new Employee(1, "Jeff Bezos", 100000.0));
        sb.accept(new Employee(2, "Bill Gates", 200000.0));
        sb.accept(new Employee(3, "Mark Zuckerberg", 300000.0));
        Stream<Employee> empStream = sb.build();
        empStream.forEach(obj -> System.out.println("emp obj: " + obj));
        System.out.println();

        Integer[] intArray = {1, 2, 3};
        Stream.of(intArray).map(element ->
                        new Employee().getEmployeeById(element, Arrays.asList(arrayOfEmps)))
                .forEach(element -> System.out.println("Employee object fetched" + element));
        System.out.println();

        Integer[] arrOfInts = {1, 2, 3, 4, 5, 6, 7, 8};
        Stream.of(arrOfInts).filter(element -> element > 5).forEach(element -> System.out.println("greater than 5 elements: " + element));
        System.out.println();

        Integer output1 = Stream.of(arrOfInts).findFirst().orElse(null);
        Integer output2 = Stream.of(arrOfInts).findFirst().get();
        System.out.println("output1 : " + output1);
        System.out.println("output2 : " + output2);
        System.out.println();

        List<List<String>> namesNested = Arrays.asList(
          Arrays.asList("Jef", "tomos"),
          Arrays.asList("kamal", "kannan"),
          Arrays.asList("sait", "kooli")
        );
        System.out.println(namesNested);
        List<String> namesListSimplified = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("simplified name list: " + namesListSimplified);
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee getEmployeeById(int id, List<Employee> employeeList) {
        return employeeList.stream().filter(obj -> obj.getId() == id).collect(Collectors.toList()).get(0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
