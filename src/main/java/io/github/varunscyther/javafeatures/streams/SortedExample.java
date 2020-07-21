package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    private static List<String> sortedListOfEmotions() {
        return LocalDataRepository.getAllPersons().stream()
                .map(Person::getListOfEmotions)
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Get sorted list of emotions : " + sortedListOfEmotions());
    }
}
