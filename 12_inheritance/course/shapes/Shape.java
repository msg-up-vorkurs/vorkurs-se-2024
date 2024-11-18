package course.shapes;

public class Shape {

    String color;
    double posX;
    double posY;

    Shape(String color, double posX, double posY){
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public double getCircumference(){
        return -1;
    }

    public void printInfo(){
        System.out.println("Die Form hat die Koordinaten ( " + this.posX  + "," + this.posY + ")");
    }
}