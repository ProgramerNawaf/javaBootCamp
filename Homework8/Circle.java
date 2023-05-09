import java.lang.Math;
public class Circle extends Shape {
    private double radius;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}'+super.toString();
    }

    public double getArea(){
        return Math.pow(radius,radius)*Math.PI;
    }

    public double getPerimeter(){
        return radius*Math.PI*2;
    }
}
