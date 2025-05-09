/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.ShapeView;

/**
 *
 * @author NguyenDucAnh
 */
public class ShapeController {

    private Circle circle;
    private Triangle triangle;
    private Rectangle rectangle;
    private ShapeView view;

    public ShapeController() {
        circle = new Circle();
        triangle = new Triangle();
        rectangle = new Rectangle();
        view = new ShapeView();
    }

    public ShapeController(Circle circle, Triangle triangle, Rectangle rectangle) {
        this.circle = circle;
        this.triangle = triangle;
        this.rectangle = rectangle;
    }

    public void getValue(double value){
        circle.setRadius(value);
        view.printAnswer(circle.printResult());
    }
    
    public void getValue(double width, double height){
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        view.printAnswer(rectangle.printResult());
    }
    
    public void getValue(double sideA, double sideB, double sideC){
        triangle.setSideA(sideA);
        triangle.setSideB(sideB);
        triangle.setSideC(sideC);
        view.printAnswer(triangle.printResult());
    }
    
    public void printTilePrograṃ̣̣̣̣̣̣̣̣̣̣̣̣(String title){
        view.printTitle(title);
    }
    

}
