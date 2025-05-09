/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.FibonacciController;
import java.util.Scanner;
import view.FibonacciView;
import model.FibonacciModel;

/**
 *
 * @author NguyenDucAnh
 */
public class Main {

    private FibonacciController controller;
    private FibonacciModel model;
    private FibonacciView view;

    public Main() {
        view = new FibonacciView();
        model = new FibonacciModel();

        controller = new FibonacciController(model, view);
        view.printTitle("======= Fibonacci Program =======");
        run(controller);
    }

    private int getInt(String msg) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(msg);
            try {
                int value = Integer.parseInt(sc.nextLine());
                if (value >= 0 && value < Integer.MAX_VALUE) {
                    return value;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Must be a positive integer number!");
            }
        }
    }

    private void run(FibonacciController controller) {
        int number = getInt("Enter number: ");
        controller.generateAndDisplay(number);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }

}
