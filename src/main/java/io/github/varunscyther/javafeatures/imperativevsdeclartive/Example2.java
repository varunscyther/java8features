package io.github.varunscyther.javafeatures.imperativevsdeclartive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    // Problem Statement : Remove duplicate elements from list of integers.

    // By Two ways we can achieve same.

    public static void main(String[] args) {

        /**
         * First - Imperative style of programming that focus on how to perform an operation.
         * Basically you can call same as "How Style" of programming.
         */

        List<Integer> listOfIntegers = Arrays.asList(1,2,2,3,3,4,5,6,6,7,7,7,8,9,10,10);
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer integer : listOfIntegers){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }

        }
        System.out.println("Unique integer list : " + uniqueList);

        /**
         * Second - Declarative style of programming that focus on what needs to be done.
         * Basically you can call same as "What Style" of programming.
         */

        List<Integer> uniqueList1 = listOfIntegers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique integer list 1 : " + uniqueList1);

    }
}
