package course.shapes;

public class Rectangle {

    private String color;
    private double posX;
    private double posY;
    private double width;
    private double height;

    public Rectangle(String color, double posX, double posY, double width, double height) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
    }
    public double getCircumference() {
        return 2 * width + 2 * height;
    }

    public double getArea() {
        return width * height;
    }
}