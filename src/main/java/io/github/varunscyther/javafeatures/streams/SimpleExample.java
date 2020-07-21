package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleExample {
    public static void main(String[] args) {

        //Without filter
        Map<String, Integer> personMapWithAge = LocalDataRepository.getAllPersons().stream()
                .collect(Collectors.toMap(Person::getFirstName, Person::getAge));

        System.out.println(personMapWithAge);
        
        // With filter
        Map<String, Integer> filteredPersonMapWithAge = LocalDataRepository.getAllPersons().stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toMap(Person::getFirstName, Person::getAge));

        System.out.println(filteredPersonMapWithAge);

        // Using predicate
        Predicate<Person> personPredicate = person -> person.getAge() > 30;
        Map<String, Integer> filteredPersonMapWithAgeUsingPredicate = LocalDataRepository.getAllPersons().stream()
                .filter(personPredicate)
                .collect(Collectors.toMap(Person::getFirstName, Person::getAge));

        System.out.println(filteredPersonMapWithAgeUsingPredicate);

        // With two level for filtering
        Map<String, Integer> filteredPersonMapWithAgeUsingPredicate2 = LocalDataRepository.getAllPersons().stream()
                .filter(personPredicate)
                .filter(person -> person.getGender().equals("FEMALE"))
                .collect(Collectors.toMap(Person::getFirstName, Person::getAge));

        System.out.println(filteredPersonMapWithAgeUsingPredicate2);

        //In order to debug Streams
        Map<String, Integer> filteredPersonMapWithAgeUsingPredicate3 = LocalDataRepository.getAllPersons().stream()
                .peek(person -> {
                    System.out.println(person);
                })
                .filter(personPredicate)
                .peek(person -> {
                    System.out.println("1st level of filtering : " + person);
                })
                .filter(person -> person.getGender().equals("MALE"))
                .peek(person -> {
                    System.out.println("2nd level of filtering : " + person);
                })
                .collect(Collectors.toMap(Person::getFirstName, Person::getAge));

    }
}
