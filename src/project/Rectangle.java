package project;

public class Rectangle extends Shape2D {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public double perimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public String toString() {
        return "perimeter = " + perimeter() + "\n" + "Area = " + area();
    }

}
