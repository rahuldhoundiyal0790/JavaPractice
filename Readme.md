Single Abstract Methods
Functional Interfaces - Only 1 abstract method, 
Lambda expressions can be used to implement them.


Stream - Filter,Sort,Map,Collect

UnaryOperator - Functional interface with a single abstract method that takes one argument and returns a value of the same type.
BinaryOperator - Functional interface with a single abstract method that takes two arguments of the same type and returns a value of the same type.
Supplier - Functional interface with a single abstract method that takes no arguments and returns a value.
Predicate - Functional interface with a single abstract method that takes an argument and returns a boolean.
Comparator - Functional interface with a single abstract method that compares two objects and returns an integer.
Function - Functional interface with a single abstract method that takes an argument and returns a value.
Denoted by @FunctionalInterface annotation. - JDK1.8 onwards

UnaryOperator<T>  -- T apply(T t);
BinaryOperator<T>  -- T apply(T t1, T t2);
Function<T, R>  -- R apply(T t);
interface MyFunctionalInterface {
    void myMethod(); // Single abstract method
}
After JDK 1.8 onwards in interface can have default and static methods.
```java

