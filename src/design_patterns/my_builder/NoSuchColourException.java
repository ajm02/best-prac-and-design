package design_patterns.my_builder;

public class NoSuchColourException extends Exception {

    public NoSuchColourException(String message) {
        super(message);
    }
}
