package course.equality;

import course.Car;

public class Equals {

    public static void main(String[] args) {

        Car someCar = new Car("VW", "ID.3", "WVW921A9288L09323");
        Car anotherCar = new Car("VW", "ID.3", "WVW921A9288L09323");

        System.out.println("Same object: " + (someCar == anotherCar));
        System.out.println("Same vehicle: " + (someCar.isEqualTo(anotherCar)));

        //System.out.println("Same vehicle: " + (someCar.equals(anotherCar)));
    }
}
