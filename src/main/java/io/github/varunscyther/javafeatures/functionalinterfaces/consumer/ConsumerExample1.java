package io.github.varunscyther.javafeatures.functionalinterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("varun singh");

    }
}
