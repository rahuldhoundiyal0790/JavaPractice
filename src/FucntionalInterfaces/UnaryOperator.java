package FucntionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperator {
    public static void main(String[] args) {
        /*
        UnaryOperator is a functional interface that takes a single argument of type T and returns a result of the same type T.
        It is a specialization of the Function interface.
         */
        java.util.function.UnaryOperator<String> toUpperCase = String::toUpperCase;
        String result = toUpperCase.apply("hello world");
        System.out.println("Uppercase String: " + result);

        // Example with Integer
        java.util.function.UnaryOperator<Integer> square = x -> x * x;
        int squaredResult = square.apply(5);
        System.out.println("Squared Result: " + squaredResult);


        // Example with List
        List<String> ls = new ArrayList<>();
        ls.add("hello");
        ls.add("world");

        ls.replaceAll(ele -> ele + " new");

      System.out.println(ls);
    }
}
