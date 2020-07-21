package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;

public class CountExample {
    private static long getTotalCountOfDistinctEmotions() {
        return LocalDataRepository.getAllPersons().stream()
                .map(Person::getListOfEmotions)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println("Get total count of distinct emotions : " + getTotalCountOfDistinctEmotions());
    }
}
