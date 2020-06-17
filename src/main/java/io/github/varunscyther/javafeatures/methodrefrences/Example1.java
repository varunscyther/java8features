package io.github.varunscyther.javafeatures.methodrefrences;

import java.util.function.Function;

public class Example1 {

    static Function<String, String> toUpperCase = (s) -> s.toUpperCase();

    // Now let's use method references

    static Function<String, String> toUpperCaseUsingMethodReferences = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println("Without method reference : " + toUpperCase.apply("varun singh"));
        System.out.println("Using method reference : " + toUpperCaseUsingMethodReferences.apply("varun singh"));
    }
}
