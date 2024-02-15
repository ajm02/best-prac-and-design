package design_patterns.my_builder;

class Car {

    private int seats;
    private double length;
    private double width;
    private double height;
    private double mphTopSpeed;
    private boolean wheelRight;
    private String colour;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMphTopSpeed() {
        return mphTopSpeed;
    }

    public void setMphTopSpeed(double mphTopSpeed) {
        this.mphTopSpeed = mphTopSpeed;
    }

    public boolean isWheelRight() {
        return wheelRight;
    }

    public void setWheelRight(boolean wheelRight) {
        this.wheelRight = wheelRight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
