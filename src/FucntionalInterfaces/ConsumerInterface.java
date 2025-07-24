package FucntionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        /*
        Consumer is a functional interface that represents an operation that takes a single argument and returns no result.
        It is often used for operations that perform side effects, such as printing to the console or modifying an object.
         */
        Consumer<String> printConsumer = System.out::println;
        printConsumer.accept("Hello, Consumer Interface!");

        // Example with Integer
        Consumer<Integer> squareConsumer = x -> System.out.println("Square: " + (x * x));
        squareConsumer.accept(5);

        // Example with List
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        list.forEach(item -> System.out.println("Item: " + item));
    }
}
