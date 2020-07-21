package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    private static List<String> listOfEmotions() {
        return LocalDataRepository.getAllPersons().stream()
                .map(Person::getListOfEmotions)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Get all distinct emotions : " + listOfEmotions());
    }
}
