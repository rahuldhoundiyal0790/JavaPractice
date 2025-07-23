package FucntionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOperator {
    public static void main(String[] args) {
        /*
        Predicate is a functional interface that takes a single argument of type T and returns a boolean value.
        It is often used for filtering or matching conditions.
         */

        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        boolean result = isNotEmpty.test("Hello World");
        System.out.println("Is the string not empty? " + result);

        // Example with Integer
        Predicate<Integer> isPositive = num -> num > 0;
        boolean isPos = isPositive.test(-5);
        System.out.println("Is the number positive? " + isPos);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> collectionList = list.stream().filter( num -> num>5).collect(Collectors.toList());

        System.out.println(collectionList);

        // Example with filtering a list
        List<String> names = Arrays.asList("Alice", "Bob", "", "Charlie", "David");
        List<String> nonEmptyNames = names.stream()
                .filter(isNotEmpty)
                .collect(Collectors.toList());

        System.out.println("Non-empty names: " + nonEmptyNames);


    }
}
