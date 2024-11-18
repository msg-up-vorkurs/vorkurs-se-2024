package course.shapes;

public class Circle extends Shape {

    double radius;

    public Circle(String color, double posX, double posY, double radius) {
        super(color, posX, posY);
        this.radius = radius;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Ich bin ein Kreis mit Farbe " + color);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}