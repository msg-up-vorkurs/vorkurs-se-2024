package course.shapes;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color, double posX, double posY, double width, double height) {
        super(color, posX, posY);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getCircumference() {
        return 2 * width + 2 * height;
    }

    public double getArea() {
        return width * height;
    }
}