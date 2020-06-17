package io.github.varunscyther.javafeatures.functionalinterfaces.predicate;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    static Predicate<Person> personPredicate1 = person -> person.getAge() > 30;
    static Predicate<Person> personPredicate2 = person -> person.getGender().equals("FEMALE");
    static List<Person> personList = LocalDataRepository.getAllPersons();

    public static void getAllPersonAgeGrtThan30() {
        personList.forEach(person -> {
            if(personPredicate1.test(person)) {
                System.out.println("Person age more that 30 : " + person);
            }
        });
    }

    public static void getAllPersonWithGenderAsFemale() {
        personList.forEach(person -> {
            if(personPredicate2.test(person)) {
                System.out.println("Person with gender as female : " + person);
            }
        });
    }

    public static void getAllPersonWithGenderAsFemaleAndAgeGrtThan30() {
        personList.forEach(person -> {
            if(personPredicate1.and(personPredicate2).test(person)) {
                System.out.println("Person with gender as female and age greater than 30: " + person);
            }
        });
    }

    public static void getAllPersonWithGenderAsFemaleAndAgeIsNotGrtThan30() {
        personList.forEach(person -> {
            if(personPredicate1.negate().and(personPredicate2).test(person)) {
                System.out.println("Person with gender as female and age not greater than 30: " + person);
            }
        });
    }


    public static void main(String[] args) {
        getAllPersonAgeGrtThan30();
        getAllPersonWithGenderAsFemale();
        getAllPersonWithGenderAsFemaleAndAgeGrtThan30();
        getAllPersonWithGenderAsFemaleAndAgeIsNotGrtThan30();
    }
}
