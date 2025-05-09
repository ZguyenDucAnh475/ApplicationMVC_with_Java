/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.LinearSearchModel;
import view.LinearSearchView;

/**
 *
 * @author NguyenDucAnh
 */
public class LinearSearchController {

    private LinearSearchModel model;
    private LinearSearchView view;
    private Scanner scanner = new Scanner(System.in);

    public LinearSearchController(LinearSearchModel model, LinearSearchView view) {
        this.model = model;
        this.view = view;
    }

    private int getPositiveNumber(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value > 0 && value < Integer.MAX_VALUE) {
                    return value;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Must be a positive integer number!");
            }
        }
    }

    public void run() {
        int size = getPositiveNumber("Enter size of array: ");
        int min = getPositiveNumber("Enter minimum value: ");
        int max = getPositiveNumber("Enter maximum value: ");
        while (max < min) {
            System.err.println("maximum must be >= minimum.");
            max = getPositiveNumber("Enter maximum value: ");
        }
        System.out.println(String.format("Randoming... from %d to %d: ", min, max));

        model.generateArray(size, min, max);
        int[] array = model.getArray();
        view.displayArray(array);

        int searchValue = getPositiveNumber("Enter number to search: ");
        int index = model.linearSearch(searchValue);
        view.displayResult(index, searchValue);
    }

}
