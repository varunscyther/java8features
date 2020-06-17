package io.github.varunscyther.javafeatures.functionalinterfaces.consumer;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void getPersonsFullName() {
        BiConsumer<String, String> personBiConsumer = (firstName, lastName) -> System.out.println(firstName + " " + lastName);
        List<Person> personList = LocalDataRepository.getAllPersons();
        personList.forEach(person -> personBiConsumer.accept(person.getFirstName(), person.getSurName()));

    }

    public static void main(String[] args) {
        getPersonsFullName();
    }
}
