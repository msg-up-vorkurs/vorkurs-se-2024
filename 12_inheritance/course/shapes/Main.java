package course.shapes;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("red", 5, 1, 2.5, 2);
        Circle circle1 = new Circle("blau", 10, 5, 5);

//        System.out.println(circle1.getArea());

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(rectangle);

        for (Shape shape: shapes) {
            System.out.println(shape.getCircumference());
            shape.printInfo();
        }

    }
}
