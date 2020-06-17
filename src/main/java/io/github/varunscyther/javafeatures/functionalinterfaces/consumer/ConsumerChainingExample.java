package io.github.varunscyther.javafeatures.functionalinterfaces.consumer;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainingExample {

    static Consumer<Person> personNameConsumer = (person) -> System.out.print(person.getFirstName().concat(person.getSurName()));
    static Consumer<Person> personAgeConsumer = (person) -> System.out.println(" : " + person.getAge());
    static List<Person> personList = LocalDataRepository.getAllPersons();

    public static void getAllPersonNameAndAge() {

        personList.forEach(personNameConsumer.andThen(personAgeConsumer)); //  This is called consumer chaining

    }

    public static void getAllPersonNameAndAgeBasedOnCondition() {

        personList.forEach((person -> {
            if(person.getAge() > 35){
                personNameConsumer.andThen(personAgeConsumer).accept(person);
            }
        })); //  This is called consumer conditional chaining

    }

    public static void main(String[] args) {
        getAllPersonNameAndAge();
        System.out.println("Now filter person based on condition");
        getAllPersonNameAndAgeBasedOnCondition();
    }
}
