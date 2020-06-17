package io.github.varunscyther.javafeatures.functionalinterfaces;

import io.github.varunscyther.javafeatures.data.Person;

import java.util.List;

@FunctionalInterface
public interface PersonFunctionalInterface {
	public List<Person> addToPersonList(Person p1, Person p2);
}
