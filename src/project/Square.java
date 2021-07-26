package project;

public class Square extends Rectangle {

    public Square(double l) {
        super(l, l);
    }

    @Override
    public String toString() {
        return "premeter = " + perimeter() + "\n" + "Area = " + area();
    }

    @Override
    public double perimeter() {
        return length * 4;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }

}
