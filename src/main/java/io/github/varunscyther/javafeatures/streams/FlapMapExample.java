package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FlapMapExample {

    private static List<String> listOfEmotions() {
        return LocalDataRepository.getAllPersons().stream()
                .map(Person::getListOfEmotions)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Usage of flat to get all emotions : " + listOfEmotions());
    }
}
