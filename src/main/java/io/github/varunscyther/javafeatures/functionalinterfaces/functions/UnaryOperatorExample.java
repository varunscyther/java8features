package io.github.varunscyther.javafeatures.functionalinterfaces.functions;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    // This can be used instead of Function where input and output is for same type
    static UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase();

    public static void main(String[] args) {
        System.out.println("Test unary operator : " + unaryOperator.apply("varun singh"));
    }
}
