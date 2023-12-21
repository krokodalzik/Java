package Example.Four.Circle;

import Example.three.Shape.inheritance.Circle1;

public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("red ", true, 12);
        System.out.println("\n");
        System.out.println(circle);
        circle.printRadius();
        circle.getPerimeter(5);
        circle.getArea();
    }
}
