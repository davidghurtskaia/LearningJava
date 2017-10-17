package Homework_4;

public class Car {
    private String firmName;
    private String model;
    private int releaseDate;
    private String color;

    public Car(String firmName, String model, int releaseDate, String color) {
        this.firmName = firmName;
        this.model = model;
        this.releaseDate = releaseDate;
        this.color = color;
    }

    @Override
    public String toString() {
        return firmName;
    }
}