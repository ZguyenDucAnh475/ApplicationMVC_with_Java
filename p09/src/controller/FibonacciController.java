/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.FibonacciModel;
import view.FibonacciView;

/**
 *
 * @author NguyenDucAnh
 */
public class FibonacciController {
    private FibonacciModel model;
    private FibonacciView view;

    public FibonacciController(FibonacciModel model, FibonacciView view) {
        this.model = model;
        this.view = view;
    }
    
    public void generateAndDisplay(int n){
        int[] sequence = model.getFibonacciSequence(n);
        view.printFibonacciView(sequence);
    }
}
