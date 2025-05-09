/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ShapeController;
import java.util.Scanner;

/**
 *
 * @author NguyenDucAnh
 */
public class Main {

    private ShapeController controller;

    private double getDouble(String msg) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            try {
                double value = Double.parseDouble(sc.nextLine());
                if (value > 0 && value < Double.MAX_VALUE) {
                    return value;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Must a postive double number!");
            }
        }
    }

    private int getChoice(String msg, int minLimit, int maxLimit) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            try {
                int value = Integer.parseInt(sc.nextLine());
                if (value >= minLimit && value <= maxLimit) {
                    return value;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println(String.format("Must be a postive number(from %d to %d!)", minLimit, maxLimit));
            }
        }
    }

    public Main() {
        controller = new ShapeController();
        run(controller);
    }

    private void run(ShapeController controller) {
        while (true) {
            controller.printTilePrograṃ̣̣̣̣̣̣̣̣̣̣̣̣("=========== Calculate Area && Perimeter Shape ===========");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");
            System.out.println("4. Exit");
            int choice = getChoice("Enter your choice number: ", 1, 4);
            switch (choice) {
                case 1:
                    // Circle
                    double Radius = getDouble("Enter Radius: ");
                    controller.getValue(Radius);
                    break;
                case 2:
                    // Triangle
                    double sideA = getDouble("Enter sideA: ");
                    double sideB = getDouble("Enter sideB: ");
                    double sideC = getDouble("Enter sideC: ");
                    while (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
                        System.err.println("Invalid Triangle. Please re-enter:");
                        sideA = getDouble("Enter sideA: ");
                        sideB = getDouble("Enter sideB: ");
                        sideC = getDouble("Enter sideC: ");
                    }
                    controller.getValue(sideA, sideB, sideC);
                    break;
                case 3:
                    // Rectangle
                    double Height = getDouble("Enter height: ");
                    double Width = getDouble("Enter width: ");
                    while (Height < Width) {
                        System.err.println("Height must be greater than or equal to width. Please re-enter:");
                        Height = getDouble("Enter height: ");
                        Width = getDouble("Enter width: ");
                    }
                    controller.getValue(Width, Height);
                    break;
                case 4:
                    // Exit
                    return;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }

}
