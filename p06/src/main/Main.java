/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.BinarySearchController;
import model.BinarySearchModel;
import view.BinarySearchView;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author NguyenDucAnh
 */
public class Main {

    private BinarySearchController controller;
    private BinarySearchModel model;
    private BinarySearchView view;
    private Scanner scanner;

    private int[] getArray(int size) {

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print(String.format("array[%d]: ", i));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    private int getInt(String msg) {
        while (true) {
            System.out.println(msg);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value > 0 && value < Integer.MAX_VALUE) {
                    return value;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Must a positive integer number!");
            }
        }
    }

    public Main() {
        scanner = new Scanner(System.in);

        int size = getInt("Enter your size of array: ");
        int[] newArray = getArray(size);
        Arrays.sort(newArray); // Xac dinh rang mang sorted

        model = new BinarySearchModel(newArray);
        view = new BinarySearchView();
        controller = new BinarySearchController(model, view);

        int key = getInt("Enter number you want to find: ");
        controller.searchKey(key);

        scanner.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }

}
