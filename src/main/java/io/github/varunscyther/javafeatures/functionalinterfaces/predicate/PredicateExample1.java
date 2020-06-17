package io.github.varunscyther.javafeatures.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample1 {
    static Predicate<Integer> p1 = (i) -> i%2==0;
    static Predicate<Integer> p2 = (i) -> i%4==0;

    public static void main(String[] args) {
        //Test Predicate
        System.out.println("Test Predicate p1 : " + p1.test(5));
        System.out.println("Test Predicate p1 : " + p1.test(4));

        System.out.println("Test Predicate p2 : " + p2.test(8));
        System.out.println("Test Predicate p2 : " + p2.test(10));

        //Test Predicate Chaining
        // Test with "AND"
        System.out.println("Test 1 Predicate Chaining using and : " + p1.and(p2).test(8));
        System.out.println("Test 2 Predicate Chaining using and : " + p1.and(p2).test(10));

        // Test with "OR"
        System.out.println("Test 1 Predicate Chaining using or : " + p1.or(p2).test(8));
        System.out.println("Test 2 Predicate Chaining using or : " + p1.or(p2).test(10));

        //Test with "NEGATE"
        System.out.println("Test 1 Predicate Chaining using negate : " + p1.or(p2).negate().test(8));
        System.out.println("Test 2 Predicate Chaining using negate : " + p1.or(p2).negate().test(10));
    }
}
