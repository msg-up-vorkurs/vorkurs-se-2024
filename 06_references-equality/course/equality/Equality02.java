package course.equality;

import course.Car;

public class Equality02 {

    public static void main(String[] args) {

        Car someCar = new Car("VW", "ID.3", "WVW921A9288L09323");
        Car anotherCar = new Car("VW", "ID.3", "WVW921A9288L09323");

        if (someCar == anotherCar) {
            System.out.println("Same vehicle.");
        } else {
            System.out.println("Different vehicle.");
        }
    }
}
