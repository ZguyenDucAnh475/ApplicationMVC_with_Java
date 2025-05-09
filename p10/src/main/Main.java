/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.LinearSearchController;
import model.LinearSearchModel;
import view.LinearSearchView;

/**
 *
 * @author NguyenDucAnh
 */
public class Main {

    private LinearSearchController controller;
    private LinearSearchModel model;
    private LinearSearchView view;

    public Main() {
        model = new LinearSearchModel();
        view = new LinearSearchView();
        controller = new LinearSearchController(model, view);
        controller.run();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }

}
