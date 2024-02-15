package design_patterns.my_factory;

public class Person implements Animal {


    @Override
    public void eat() {
        System.out.println("Person eats from a wide variety of different foods");
    }

    @Override
    public void sleep() {
        System.out.println("Person sleeps for 8 hours");
    }

    @Override
    public void drink() {
        System.out.println("Person drinks some water");
    }
}
