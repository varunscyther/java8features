package io.github.varunscyther.javafeatures.functionalinterfaces.functions;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> binaryOperator = (integer1, integer2) -> integer1 * integer2;
    static Comparator<Integer> comparator = (integer1, integer2) -> integer1.compareTo(integer2);

    public static void main(String[] args) {
        System.out.println("Test basic binary operations : " + binaryOperator.apply(150, 170));

        BinaryOperator<Integer> getMaximumValue = BinaryOperator.maxBy(comparator);
        System.out.println("Test maxby operation : " + getMaximumValue.apply(150, 170));

        BinaryOperator<Integer> getMinimumValue = BinaryOperator.minBy(comparator);
        System.out.println("Test minby operation : " + getMinimumValue.apply(150, 170));

    }
}
