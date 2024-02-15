package design_patterns.my_builder;

import java.util.InputMismatchException;

public class StandardBuilder extends CarBuilder {


    public StandardBuilder() {
        super();
    }

    @Override
    public Car build() {
        buildSeats();
        buildDimensions();
        setTopSpeed();
        setRightDrive();
        setColour();
        return car;
    }

    @Override
    void buildSeats() {
        Integer seats = null;
        while (seats == null) {
            try {
                System.out.println("Please enter the number of seats for this car: ");
                int enteredSeats = input.nextInt();
                if (enteredSeats < 2) {
                    throw new IllegalArgumentException("A car must have at least 2 seats");
                } else if (enteredSeats > 7) {
                    throw new IllegalArgumentException("A car cannot have that many seats");
                } else {
                    seats = enteredSeats;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Illegal number of seats: " + iae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input: " + ime.getMessage());
            } catch (Exception e) {
                System.out.println("An error has occurred: ");
                e.printStackTrace();
            }
        }

        car.setSeats(seats);
    }

    private double getDimensionInput(String dimensionName, double min, double max) {
        Double dimension = null;
        while (dimension == null) {
            try {
                System.out.println("Please enter the " + dimensionName + " of this car: ");
                double enteredDimension = input.nextDouble();
                if (enteredDimension < min) {
                    throw new IllegalArgumentException("The value you have entered is too small");
                } else if (enteredDimension > max) {
                    throw new IllegalArgumentException("The value you have entered is too large");
                } else {
                    dimension = enteredDimension;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Illegal " + dimensionName + ": " + iae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input: " + ime.getMessage());
            } catch (Exception e) {
                System.out.println("An error has occurred: ");
                e.printStackTrace();
            }
        }

        return dimension;
    }

    @Override
    void buildDimensions() {
        double length = getDimensionInput("length", 2, 5);
        double width = getDimensionInput("width", 1.5, 5);
        double height = getDimensionInput("height", 2, 4);

        car.setLength(length);
        car.setWidth(width);
        car.setHeight(height);
    }

    @Override
    void setTopSpeed() {
        Double topSpeed = null;
        while (topSpeed == null) {
            try {
                System.out.println("Please enter the top speed of this car in mph: ");
                double enteredSpeed = input.nextDouble();
                if (enteredSpeed < 5) {
                    throw new IllegalArgumentException("A car cannot be this slow");
                } else if (enteredSpeed > 331) {
                    throw new IllegalArgumentException("The world's fastest car is slower");
                } else {
                    topSpeed = enteredSpeed;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Illegal speed: " + iae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input: " + ime.getMessage());
            } catch (Exception e) {
                System.out.println("An error has occurred: ");
                e.printStackTrace();
            }
        }
        
        car.setMphTopSpeed(topSpeed);
    }

    @Override
    void setRightDrive() {
        super.setRightDrive();
    }

    @Override
    void setColour() {
        super.setColour();
    }
}
