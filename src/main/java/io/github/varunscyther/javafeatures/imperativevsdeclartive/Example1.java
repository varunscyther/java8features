package io.github.varunscyther.javafeatures.imperativevsdeclartive;

import java.util.stream.IntStream;

public class Example1 {
    // Problem Statement : I want to get sum of all numbers between 1 to 100.

    // By Two ways we can achieve same.


    public static void main(String[] args) {

        /**
         * First - Imperative style of programming that focus on how to perform an operation.
         * Basically you can call same as "How Style" of programming.
         */

        int sumUsingImperative = 0;
        for(int i = 0; i <= 100; i++){
            sumUsingImperative += i;
        }
        System.out.println("Sum of all numbers from 1 to 100 using imperative style : " + sumUsingImperative);

        /**
         * Second - Declarative style of programming that focus on what needs to be done.
         * Basically you can call same as "What Style" of programming.
         */
        Integer sumUsingDeclarative = IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum of all numbers from 1 to 100 using declarative style : " + sumUsingDeclarative);

        /**
         * With the imperative approach we may lead to concurrency issues as we are using mutable objects
         * where as with declarative functional programming approach we can use concept of parallel programming.
         */
        Integer sumUsingDeclarativeToHandleConcurrency = IntStream.rangeClosed(0,100).parallel().sum();
        System.out.println("Sum of all numbers from 1 to 100 using declarative style with concurrency control : " + sumUsingDeclarativeToHandleConcurrency);

    }
}
