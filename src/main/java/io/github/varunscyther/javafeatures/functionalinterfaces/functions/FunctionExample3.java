package io.github.varunscyther.javafeatures.functionalinterfaces.functions;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample3 {

    static Predicate<Person> verifyMale = (person) -> person.getGender().equalsIgnoreCase("MALE");

    static Function<List<Person>, Map<String, Integer>> getAllMalePersonWithFullNameAndAge = (persons) ->{
        Map<String, Integer> personMap = new HashMap<>();
        persons.forEach((person -> {
            if(verifyMale.test(person)){
                personMap.put(person.getFirstName() + " " + person.getSurName(), person.getAge());
            }
        }));

        return personMap;
    };

    public static void main(String[] args) {
        System.out.println("Get all male persons : " + getAllMalePersonWithFullNameAndAge.apply(LocalDataRepository.getAllPersons()));
    }
}
