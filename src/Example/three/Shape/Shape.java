package Example.three.Shape;

public class Shape {
    public String color;
    public boolean filled;


    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    @Override
    public java.lang.String toString() {
        return color + filled;
    }
}
