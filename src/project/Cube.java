package project;

public class Cube extends Shape3D {

    private double length;

    @Override
    public double sideArea() {
        return length * length * 4;
    }

    @Override
    public double totalArea() {
        return sideArea() + (2 * Math.pow(length, 2));
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);
    }

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SideArea = " + sideArea() + "\n" + "TotalArea = " + totalArea() + "\n" + "Volume = " + volume();
    }

}
