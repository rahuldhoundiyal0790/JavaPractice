package FucntionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorClass {
    public static void main(String[] args) {

        /*
        BinaryOperator is a functional
        interface that takes two arguments of the same type and returns a result of the same type.
         */
        BinaryOperator<String> stringConcat = (s1, s2) -> s1 + " " + s2;
        String result = stringConcat.apply("Hello", "World");
        System.out.println("Concatenated String: " + result);

        //Bifunctional Interface Example

        BiFunction<Integer,Integer,Integer> bifunc = (x, y) -> x + y;
        int sum = bifunc.apply(10, 20);
        System.out.println(sum
        );
    }
}
