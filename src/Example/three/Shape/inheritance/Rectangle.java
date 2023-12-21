package Example.three.Shape.inheritance;

import Example.three.Shape.Shape;

public class Rectangle extends Shape {
    protected double width, lenght;

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.lenght = lenght;
        this.width = width;
    }

    public void printParametr() {
        System.out.println(lenght + width);
    }

    public void getArea() {
        double x = width / lenght * 0.5;
        System.out.println("Площадь данного числа: " + x);
    }

    public void getPerimeter() {
        double x = lenght * 3;
        System.out.println("Преиметр данного числа: " + x);

    }
}
