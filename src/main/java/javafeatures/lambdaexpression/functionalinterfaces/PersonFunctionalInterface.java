package javafeatures.lambdaexpression.functionalinterfaces;

import java.util.List;

import javafeatures.lambdaexpression.model.Person;

@FunctionalInterface
public interface PersonFunctionalInterface {
	public List<Person> addToPersonList(Person p1, Person p2);
}
