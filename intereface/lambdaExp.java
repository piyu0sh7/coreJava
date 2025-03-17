package intereface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface DoubleNumber {
    int doubleIt(int n); // Abstract method
}
public class lambdaExp {
    public static void main(String[] args) {
        // Lambda expression implementing the functional interface
        DoubleNumber doubleNumber = n -> n * 2;

        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using stream with the functional interface
        numbers.stream()
               .map(doubleNumber::doubleIt) // Method reference to lambda
               .forEach(System.out::println); // Print each doubled number
    }
}
