package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CustomisedSortExample {

    public static List<Person> getAllPersonSortedBasedOnFirstName() {
        return LocalDataRepository.getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(toList());
    }

    public static List<Person> getAllPersonSortedBasedOnAge() {
        return LocalDataRepository.getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(toList());
    }

    public static List<Person> getAllPersonSortedBasedOnDescendingAge() {
        return LocalDataRepository.getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        getAllPersonSortedBasedOnFirstName().forEach(System.out::println);
        System.out.println("===========================================");
        getAllPersonSortedBasedOnAge().forEach(System.out::println);
        System.out.println("===========================================");
        getAllPersonSortedBasedOnDescendingAge().forEach(System.out::println);

    }
}
