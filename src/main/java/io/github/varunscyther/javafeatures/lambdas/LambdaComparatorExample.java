package io.github.varunscyther.javafeatures.lambdas;

import io.github.varunscyther.javafeatures.data.Person;
import io.github.varunscyther.javafeatures.functionalinterfaces.PersonFunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorExample {

    public static void main(String[] args) {
        PersonFunctionalInterface personFunctionalInterface = (p1, p2) -> {
            List<Person> personList = new ArrayList<Person>();
            personList.add(p1);
            personList.add(p2);
            return personList;
        };

        Person p1 = new Person("Singh", "Varun", "MALE", 32);

        Person p2 = new Person("Varun", "Swati", "FEMALE", 29);

        List<Person> persons = personFunctionalInterface.addToPersonList(p1, p2);

        // Legacy way
        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }

        });

        System.out.println("Sorted Person List in legacy way");

        for (Person p : persons) {
            System.out.println("Person p : " + p.getSurName());
        }

        System.out.println("Sorting Person List in Lambda way");
        Collections.sort(persons, (p3, p4) -> p3.getSurName().compareTo(p4.getSurName()));
		persons.forEach((p -> System.out.println("Person p : " + p.getSurName())));

    }

}
