package course.callbyvalue;

import course.Car;

public class CallByValue02 {

    public static void main(String[] args) {

        Car vw = new Car("VW", "ID.3", "WVW921A9288L09323");
        vw.printDetails();

        colorize(vw);

        vw.printDetails();
    }

    public static void colorize(Car car) {
        car.applyColor("red");
        car.printDetails();
    }
}
