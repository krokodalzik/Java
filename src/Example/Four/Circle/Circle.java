package Example.Four.Circle;

import Example.three.Shape.Shape;

public class Circle extends Shape {

    protected double radius;
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public void getArea(){
        double x = radius * 3.14;
        System.out.println("Площадь данного числа: " + x);
    }
    public void getPerimeter( double x){
        x = 2 * 3.14 * x;
        System.out.println("Периметр данного числа: " + x);
    }

    public void printRadius(){
        System.out.println(radius);
    }
}
