package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceExample {
    public static int getSumOfAllPersonsAgeExample1() {
        List<Integer> ageList = LocalDataRepository.getAllPersons().stream()
                .map(Person::getAge)
                .collect(Collectors.toList());
        return ageList.stream().reduce(0, (a,b) -> a+b);
    }

    public static Optional<Integer> getSumOfAllPersonsAgeExample2() {
        List<Integer> ageList = LocalDataRepository.getAllPersons().stream()
                .map(Person::getAge)
                .collect(Collectors.toList());
        return ageList.stream().reduce((a,b) -> a+b);
    }

    public static void main(String[] args) {
        System.out.println("Sum of all persons ages with using initial value in reduce API : "
                + getSumOfAllPersonsAgeExample1());

        System.out.println("Sum of all persons ages without using initial value in reduce API : "
                + getSumOfAllPersonsAgeExample2().get());

    }
}
