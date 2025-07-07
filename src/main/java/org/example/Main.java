package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void activityFive(List<Person> people) {
        // Sorted by age (ascending)
        List<Person> peopleSortedByAgeAsc = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .toList();
        System.out.println("Sorted by age (ascending):");
        peopleSortedByAgeAsc.forEach(System.out::println);

        System.out.println();

        // Sorted by name
        List<Person> peopleSortedByName = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .toList();
        System.out.println("Sorted by name:");
        peopleSortedByName.forEach(System.out::println);

        System.out.println();

        // Sorted by age (descending)
        List<Person> peopleSortedByAgeDesc = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .toList();
        System.out.println("Sorted by age (descending):");
        peopleSortedByAgeDesc.forEach(System.out::println);
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