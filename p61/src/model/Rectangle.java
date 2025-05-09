/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        double Perimeter = 2 * (width + height);
        return Perimeter;
    }

    @Override
    public double getArea() {
        double Area = height * width;
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
