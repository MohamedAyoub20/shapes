package project;

public class Circle extends Oval {

    public Circle(double r) {
        super(r, r);
        
    }

    @Override
    public double perimeter() {
        return Math.PI * radios1;
    }

    @Override
    public String toString() {
        return "perimeter = " + perimeter() + "\n" + "Area = " + area();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radios1, 2);
    }

}
