package io.github.varunscyther.javafeatures.functionalinterfaces.consumerandpredicate;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateExample {
    static Predicate<Person> personPredicate1 = person -> person.getAge() > 20;
    static Predicate<Person> personPredicate2 = person -> person.getGender().equals("FEMALE");

    static BiConsumer<String, String> biConsumer = (firstName, lastName) -> System.out.println("Person first name is : " + firstName + " and last name is : " + lastName);

    static Consumer<Person> personConsumer = person -> {
        if(personPredicate1.and(personPredicate2).test(person)){
            biConsumer.accept(person.getFirstName(), person.getSurName());
        }
    };

    public static void main(String[] args) {
        List<Person> personList = LocalDataRepository.getAllPersons();
        personList.forEach(personConsumer);

    }
}
