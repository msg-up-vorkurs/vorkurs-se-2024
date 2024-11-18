package course.shapes;

public class Circle {

    String color;
    double posX;
    double posY;
    double radius;

    public Circle(String color, double posX, double posY, double radius) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}