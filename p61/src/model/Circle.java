/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public class Circle implements Shape {

    private final double pi = 3.14;
    private double Radius;

    public Circle() {
    }

    public Circle(double Radius) {
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    @Override
    public double getPerimeter() {
        double Perimeter = 2 * pi * Radius;
        return Perimeter;
    }

    @Override
    public double getArea() {
        double Area = pi * Math.pow(Radius, 2);
        return Area;
    }

    @Override
    public String printResult() {
        StringBuilder out = new StringBuilder();
        out.append("Area: ").append(String.valueOf(getArea()));
        out.append("\nPerimeter: ").append(String.valueOf(getPerimeter()));
        return out.toString();
    }

}
