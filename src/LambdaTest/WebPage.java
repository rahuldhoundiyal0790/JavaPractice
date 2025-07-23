package LambdaTest;
//Single Abstract Methods

@FunctionalInterface
public interface WebPage {
    void header(String value);
// You can add more methods here if needed, but they must not change the functional nature of the interface.}

    // Example of a default method
    default void footer(String value) {
        System.out.println("Footer: " + value);
    }

    // Example of a static method
    static void printPageInfo(String info) {
        System.out.println("Page Info: " + info);
    }
}
