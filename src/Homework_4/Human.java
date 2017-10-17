package Homework_4;

public class Human {
    private String name;
    private String surName;
    private String Gender;
    private Car favoriteCar;

    public Human(String name, String surName, String gender, Car favoriteCar) {
        this.name = name;
        this.surName = surName;
        Gender = gender;
        this.favoriteCar = favoriteCar;
    }

    @Override
    public String toString() {
        return name + " " + surName + " likes " + favoriteCar;
    }
}