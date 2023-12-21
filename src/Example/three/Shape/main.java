package Example.three.Shape;

import Example.three.Shape.inheritance.Circle1;
import Example.three.Shape.inheritance.Rectangle;
import Example.three.Shape.inheritance.Square;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape("red ", true);
        System.out.println(shape);


        Circle1 circle = new Circle1("red ", true, 12);
        System.out.println("\n");
        System.out.println(circle);
        circle.printRadius();
        circle.getPerimeter(5);
        circle.getArea();


        Rectangle rectangle = new Rectangle("yellow ", true, 17, 15);
        System.out.println("\n");
        rectangle.getPerimeter();
        rectangle.getArea();
        rectangle.printParametr();
        System.out.println(rectangle);
        System.out.println("\n");



        Square square = new Square("Green ", false, 12.35);
        System.out.println(square);
        square.getArea(10);
        square.getPerimeter(10);
        square.s();
    }
}
