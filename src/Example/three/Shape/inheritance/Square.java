package Example.three.Shape.inheritance;

import Example.three.Shape.Shape;

public class Square extends Shape {
    protected double side;
    public Square(String color, boolean filled, double side) {
        super(color,  filled);
        this.side = side;
    }
    public void s(){
        System.out.println(side);
    }
    public void getPerimeter(double x){
        x = x * 4;
        System.out.println(x);
    }
    public void getArea(double x){
        x = x * x;
        System.out.println(x);
    }


}
