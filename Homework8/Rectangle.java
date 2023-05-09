public class Rectangle extends Shape{
    private double width ;
    private double length;

    public Rectangle() {

    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean isFilled) {
        super(color, isFilled);
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(String color, boolean isFilled , double width , double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}'+super.toString();
    }
}
