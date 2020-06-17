package io.github.varunscyther.javafeatures.functionalinterfaces.predicate;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    static BiPredicate<Integer, String> biPredicate = (age, gender) -> age > 20 && gender.equals("FEMALE");

    static BiConsumer<String, String> biConsumer = (firstName, lastName) -> System.out.println("Person first name is : " + firstName + " and last name is : " + lastName);

    static Consumer<Person> personConsumer = person -> {
        if(biPredicate.test(person.getAge(), person.getGender())){
            biConsumer.accept(person.getFirstName(), person.getSurName());
        }
    };

    public static void main(String[] args) {
        List<Person> personList = LocalDataRepository.getAllPersons();
        personList.forEach(personConsumer);

    }
}
