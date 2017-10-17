package Homework_4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "Sedan", 2010, "Silver");
        Human averageJoe = new Human("Jeff", "Sanderson", "Male",car);
        System.out.println(averageJoe);
    }
}