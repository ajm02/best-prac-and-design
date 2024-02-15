package design_patterns.my_factory;

public class AnimalFactory {

    public static Animal createAnimal(AnimalName name) throws IllegalArgumentException {
        Animal animal;
        
        switch (name) {
            case AnimalName.CAT -> {
                animal = new Cat();
            }
            case AnimalName.DOG -> {
                animal = new Dog();
            }
            case AnimalName.PERSON -> {
                animal = new Person();
            }
            default -> {
                throw new IllegalArgumentException("LOLOLOL it broke");
            }
        }

        return animal;
    }
}
