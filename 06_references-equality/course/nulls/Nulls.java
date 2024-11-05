package course.nulls;

import course.Car;

public class Nulls {

    public static void main(String[] args) {
        Car car = new Car("VW", "ID.3", "WVW921A9288L09323");
        car.applyColor("white");
        //car.installEngine(new Engine(125));
        car.start();

        car.printDetails();
    }
}
