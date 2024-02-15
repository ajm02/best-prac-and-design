package design_patterns.my_factory;

public class Cat implements Animal {


    @Override
    public void eat() {
        System.out.println("Cat eats some cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps for 12 hours");
    }

    @Override
    public void drink() {
        System.out.println("Cat drinks some milk");
    }
}
