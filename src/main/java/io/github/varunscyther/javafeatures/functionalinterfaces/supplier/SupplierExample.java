package io.github.varunscyther.javafeatures.functionalinterfaces.supplier;

import io.github.varunscyther.javafeatures.data.LocalDataRepository;
import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    // Supplier functional interface is just opposite of Consumer interface as it doesn't accept any input only return output
    static Supplier<List<Person>> personSupplier = () -> LocalDataRepository.getAllPersons();

    public static void main(String[] args) {
        System.out.println("Test supplier behaviour : " + personSupplier.get());
    }
}
