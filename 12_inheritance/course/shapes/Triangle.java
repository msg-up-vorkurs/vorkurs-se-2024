package course.shapes;

/**
 * This class defines a simple triangle.
 * It assumes an isosceles triangle.
 */
public class Triangle {

    private String color;
    private double posX;
    private double posY;
    private double base;
    private double height;

    public Triangle(String color, double posX, double posY, double base, double height) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
        this.base = base;
        this.height = height;
    }

    public double getCircumference() {
        double a = Math.sqrt(Math.pow((base / 2), 2) + Math.pow(height, 2));

        return 2 * a + base;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}