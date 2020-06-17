package io.github.varunscyther.javafeatures.methodrefrences;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.function.Consumer;

public class Example2 {

    static Consumer<Person> c1 = (c) -> System.out.println(c);
    //Now let's use method references
    // ClassName::methodName
    static Consumer<Person> c2 = System.out::println;
    // Instance::methodName
    static Consumer<Person> c3 = Person::printAge;


    public static void main(String[] args) {
        LocalDataRepository.getAllPersons().forEach(c1);
        LocalDataRepository.getAllPersons().forEach(c2);
        LocalDataRepository.getAllPersons().forEach(c3);
    }
}
