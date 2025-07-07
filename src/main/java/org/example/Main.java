package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void activityFive(List<Person> people) {
        // Sorted by age (ascending)
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted by age (ascending):");
        people.forEach(System.out::println);

        System.out.println();

        // Sorted by name
        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorted by name:");
        people.forEach(System.out::println);

        System.out.println();

        // Sorted by age (descending)
        people.sort(Comparator.comparingInt(Person::getAge).reversed());
        System.out.println("Sorted by age (descending):");
        people.forEach(System.out::println);
    }

    public static void main(String[] args) {
        JavaStreams.activityOne();
        JavaStreams.activityTwo();
        JavaStreams.activityThree();
        JavaStreams.activityFour();

        // Initialize a list of people (Activity 5)
        List<Person> people = Arrays.asList(
                new Person("Scott", 24),
                new Person("Jerds", 22),
                new Person("Virgil", 25),
                new Person("Nadie", 23),
                new Person("CJ", 30)
        );
        activityFive(people);
    }
}