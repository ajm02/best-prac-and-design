package design_patterns.my_factory;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats some dog food");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps for 12 hours");
    }

    @Override
    public void drink() {
        System.out.println("Dog drinks some water");
    }
}
