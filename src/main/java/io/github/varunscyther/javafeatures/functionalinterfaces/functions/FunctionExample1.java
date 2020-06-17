package io.github.varunscyther.javafeatures.functionalinterfaces.functions;

import java.util.function.Function;

public class FunctionExample1 {

    static Function<Integer, String> checkAgeAndReturnGroup = (age) -> {
        if(age > 30) {
            return "MID30";
        } else {
            return "YOUNGSTER";
        }
    };

    static Function<String, String> concatGroupWithGender = (group) -> group.concat(" MALE ");

    public static void main(String[] args) {
        System.out.println("Result of checkAgeAndReturnGroup function : " + checkAgeAndReturnGroup.apply(45));
        System.out.println("Result of concatGroupWithGender function : " + concatGroupWithGender.apply("OLD AGE"));
        System.out.println("Result of andThen behaviour : " + checkAgeAndReturnGroup.andThen(concatGroupWithGender).apply(20));
        System.out.println("Result of compose behaviour : " + concatGroupWithGender.compose(checkAgeAndReturnGroup).apply(20));
    }
}
