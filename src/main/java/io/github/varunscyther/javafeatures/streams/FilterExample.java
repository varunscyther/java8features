package io.github.varunscyther.javafeatures.streams;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static List<Person> getAllPersonHavingGenderAsMaleAndAgeIsGrtThn_50(){
        return LocalDataRepository.getAllPersons().stream()
                .filter(person -> person.getGender().equals("MALE"))
                .filter(person -> person.getAge() > 50)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        getAllPersonHavingGenderAsMaleAndAgeIsGrtThn_50().forEach(System.out::println);
    }
}
