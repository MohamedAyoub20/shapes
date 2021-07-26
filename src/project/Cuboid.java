/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Mohamed
 */
public class Cuboid extends Shape3D{

    private double legnth;
    private double width;
    private double hight;

    public Cuboid(double legnth, double width, double hight) {
        this.legnth = legnth;
        this.width = width;
        this.hight = hight;
    }

    

    public double sideArea() {
        return (width + legnth) * hight * 2;
    }

    public double volume() {
        return legnth * width * hight;
    }

    public double totalArea() {
        return sideArea() + 2 * (legnth * width);
    }

    @Override
    public String toString() {
        return "side area " + sideArea() + "\ntotal area " + totalArea() + "\nvolume " + volume();
    }

}
