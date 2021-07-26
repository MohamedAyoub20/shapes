package project;

public class Triangle extends Shape2D {

    private double length;

    public Triangle(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.length * (Math.sqrt(3) / 4);

    }

    @Override
    public double perimeter() {
        return length * 3;
    }

    @Override
    public String toString() {
        return "perimeter = "+perimeter()+"\n"+"Area = "+area();
    }

   
}
