package design_patterns.my_builder;

public class CarDirector {

    public static void main(String[] args) {
        CarBuilder carBuilder = new StandardBuilder();
        Car car = carBuilder.build();
    }
}
