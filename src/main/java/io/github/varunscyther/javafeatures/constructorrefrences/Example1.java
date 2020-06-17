package io.github.varunscyther.javafeatures.constructorrefrences;

import io.github.varunscyther.javafeatures.data.Person;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example1 {
    static Supplier<Person> personSupplier = Person::new;
    static Function<String, Person> personFunction = Person::new;

    public static void main(String[] args) {
        System.out.println(personSupplier.get());
        System.out.println(personFunction.apply("SACHIN"));

    }
}
