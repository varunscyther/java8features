package io.github.varunscyther.javafeatures.functionalinterfaces.consumer;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void getAllPersons() {
        Consumer<Person> personConsumer = (person) -> System.out.println(person);
        List<Person> personList = LocalDataRepository.getAllPersons();
        personList.forEach(personConsumer);

    }

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("varun singh");
        getAllPersons();

    }
}
