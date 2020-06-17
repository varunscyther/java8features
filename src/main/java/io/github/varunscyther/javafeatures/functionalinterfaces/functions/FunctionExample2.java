package io.github.varunscyther.javafeatures.functionalinterfaces.functions;

public class FunctionExample2 {
    public static void main(String[] args) {
        String group = FunctionExample1.checkAgeAndReturnGroup.apply(70);
        System.out.println(group);
    }
}
