package design_patterns.my_builder;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public abstract class CarBuilder {

    protected Car car;
    protected final Scanner input = new Scanner(System.in);

    private final Set<String> availableColours = new HashSet<>();

    public CarBuilder() {
        this.availableColours.addAll(Set.of(
                "blue",
                "red",
                "green",
                "orange",
                "yellow"
        ));
    }

    void setRightDrive() {
        System.out.println("Does it drive on the left hand side of the road? Y or N: ");
        String dir = input.nextLine();
        if (dir.equalsIgnoreCase("y")) {
            car.setWheelRight(true);
        } else {
            car.setWheelRight(false);
        }
    }

    void setColour() {
        System.out.println("Choose a colour: \n");
        String options = "";
        for (String colour : availableColours) {
            options += colour.charAt(0) + colour.substring(1) + "\n";
        }
        System.out.println(options);

        String chosenColour = null;
        while (chosenColour == null) {
            try {
                String choice = input.nextLine();
                if (!availableColours.contains(choice.toLowerCase())) {
                    throw new NoSuchColourException("This colour is not available");
                }
                chosenColour = choice;
            } catch (NoSuchColourException e) {
                System.out.println("An error occurred with your colour: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: ");
                e.printStackTrace();
            }
        }

        car.setColour(chosenColour.toLowerCase());
    }


    abstract void buildSeats();

    abstract void buildDimensions();

    abstract void setTopSpeed();

    abstract Car build();

    // True if you want the wheel on the right hand side
}
