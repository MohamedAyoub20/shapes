package project;

public class Cylinder extends Shape3D {

    private double radios;
    private double hight;

    public Cylinder(double radios, double hight) {
        this.radios = radios;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "SideArea = " + sideArea() + "\n" + "TotalArea = " + totalArea() + "\n" + "Volume = " + volume();
    }

    @Override
    public double sideArea() {
        return Math.PI * 2 * radios * hight;
    }

    @Override
    public double totalArea() {
        return sideArea() + 2 * (Math.PI * Math.pow(radios, 2));
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radios, 2) * hight;
    }

}
