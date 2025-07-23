package FucntionalInterfaces;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

    public static void main(String[] args) {
        Function<String,Integer> func = x->x.length();
        int len = func.apply("This is a functional interface example");
        System.out.println("Length of the string is: " + len);

        //Chaining functions

        Function<Integer,Integer> func2 = x -> x*2;
        int result = func.andThen(func2).apply("Hello World");

        System.out.println("Result after chaining functions: " + result);

    }


}
