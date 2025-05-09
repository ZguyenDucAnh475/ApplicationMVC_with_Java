/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public class Triangle implements Shape {
    
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle() {
    }
    
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public double getSideA() {
        return sideA;
    }
    
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    
    public double getSideB() {
        return sideB;
    }
    
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    
    public double getSideC() {
        return sideC;
    }
    
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    @Override
    public double getPerimeter() {
        double Perimeter = sideA + sideB + sideC;
        return Perimeter;
    }

    // Nua chu vi
    private double semiPerimeter() {
        double p = sideA + sideB + sideC;
        return p;
    }
    
    @Override
    public double getArea() {
        double p = semiPerimeter(); // Get semi-perimeter
        double Area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
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
