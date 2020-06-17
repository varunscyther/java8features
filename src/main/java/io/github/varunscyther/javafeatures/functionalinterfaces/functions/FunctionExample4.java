package io.github.varunscyther.javafeatures.functionalinterfaces.functions;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class FunctionExample4 {
    static Predicate<Person> verifyMale = (person) -> person.getGender().equalsIgnoreCase("MALE");

    static BiFunction<List<Person>, Predicate<Person>, Map<String, Integer>> getAllMalePersonWithFullNameAndAge = ((persons, personPredicate) -> {
        Map<String, Integer> personMap = new HashMap<>();
        persons.forEach((person -> {
            if(personPredicate.test(person)){
                personMap.put(person.getFirstName() + " " + person.getSurName(), person.getAge());
            }
        }));

        return personMap;
    });

    public static void main(String[] args) {
        System.out.println("Get all male persons using BiFunction functional interface : " + getAllMalePersonWithFullNameAndAge
                .apply(LocalDataRepository.getAllPersons(), verifyMale));
    }
}
