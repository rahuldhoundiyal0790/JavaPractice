package LambdaTest;

public class LambdaExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the WebPage interface
        WebPage page = (String value) -> {
            System.out.println("Header: " + value);
        };

        // Calling the header method with a string argument
        page.header("Welcome to LambdaTest!");

        // Using a method reference to implement the WebPage interface
        WebPage anotherPage = System.out::println;
        anotherPage.header("This is another page header.");
    }
}
