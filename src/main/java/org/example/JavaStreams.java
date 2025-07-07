package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreams {
    // Activity 1
    public static void activityOne() {
        List<Integer> numbersFrom1To10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Initialize a list of the numbers from 1 to 10
        Predicate<Integer> isOdd = n -> n % 2 == 1; // Predicate that returns true if the number is odd (num mod 2 == 1)

        List<Integer> oddNumbersFrom1To10 = numbersFrom1To10.stream()
                .filter(isOdd) // Run the isOdd predicate on the numbers from 1 to 10
                .toList(); // Gathers the odd numbers and puts them in a List

        System.out.println("Odd numbers: " + oddNumbersFrom1To10);
    }

    // Activity 2
    public static void activityTwo() {
        List<String> listOfNames = Arrays.asList("Alice", "Adam", "Bob", "Angela", "Brian"); // Initialize a List of five names
        Predicate<String> startsWithA = s -> s.startsWith("A"); // Predicate for checking if the string starts with a capital A

        List<String> listOfNamesThatStartWithA = listOfNames.stream()
                .filter(startsWithA) // Run the startsWithA predicate on the list of names
                .toList(); // Gathers the names that start with A and puts them in a List

        System.out.println("Names starting with A: " + listOfNamesThatStartWithA);
    }

    // Activity 3
    public static void activityThree() {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = listOfIntegers.stream().map(n -> n * n).toList();
        System.out.println("Squared numbers: " + result);
    }

    // Activity 4
    public static void activityFour() {
        List<Integer> numbersFrom1To10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Initialize a list of the numbers from 1 to 10
        Predicate<Integer> isEven = n -> n % 2 == 0; // Predicate that returns true if the number is odd (num mod 2 == 1)
        Predicate<Integer> greaterThanFive = n -> n > 5; // Predicate that returns true if the number is odd (num mod 2 == 1)

        Predicate<Integer> combined = isEven.and(greaterThanFive);

        List<Integer> oddNumbersFrom1To10 = numbersFrom1To10.stream()
                .filter(combined) // Run the isOdd predicate on the numbers from 1 to 10
                .toList(); // Gathers the odd numbers and puts them in a List

        System.out.println("Even and > 5: " + oddNumbersFrom1To10);
    }

    // Activity 5
    public static void activityFive() {


        System.out.println("Even and > 5: " + oddNumbersFrom1To10);
    }

}
