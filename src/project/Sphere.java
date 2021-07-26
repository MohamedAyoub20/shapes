package project;

public class Sphere extends Shape3D {

    private double radios;

    public Sphere(double radios) {
        this.radios = radios;
    }

    @Override
    public String toString() {
        return "TotalArea = " + totalArea() + "\n" + "Volume = " + volume();
    }

    @Override
    public double totalArea() {
        return 4 * Math.PI * Math.pow(radios, 2);
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(radios, 3);
    }

    @Override
    public double sideArea() {
        return 0;
    }

}
