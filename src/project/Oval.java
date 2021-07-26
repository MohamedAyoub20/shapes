package project;

public class Oval extends Shape2D {

    protected double radios1;

    @Override
    public String toString() {
        return "Area = " + area() + "\npremeter= " + perimeter();
    }
    protected double radios2;

    public Oval(double radios1, double radios2) {
        this.radios1 = radios1;
        this.radios2 = radios2;
    }

    public double getRadios1() {
        return radios1;
    }

    public void setRadios1(double radios1) {
        this.radios1 = radios1;
    }

    public double getRadios2() {
        return radios2;
    }

    public void setRadios2(double radios2) {
        this.radios2 = radios2;
    }

    @Override
    public double area() {
        return Math.PI * radios1 * radios2;

    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((radios1 * radios1 + radios2 * radios2) / 2);
    }

}
