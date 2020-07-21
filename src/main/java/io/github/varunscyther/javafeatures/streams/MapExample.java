package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

    public static List<String> getFirstNameList() {
        return LocalDataRepository.getAllPersons().stream()
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> getFirstNameSet() {
        return LocalDataRepository.getAllPersons().stream()
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(getFirstNameList());
        System.out.println(getFirstNameSet());
    }
}
