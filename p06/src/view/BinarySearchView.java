/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author NguyenDucAnh
 */
public class BinarySearchView {

    public void displayResult(int index, int key) {
        if (index == -1) {
            System.out.println(String.format("Key %d not found", key));
        } else {
            System.out.println(String.format("Key %d found at index: %d", key, index));
        }
    }

    public void displayArray(int[] data) {
        System.out.println("Sorted Array: ");
        for (int num : data) {
            System.out.println(printNumber(num));
        }
        System.out.println("");
    }

    private String printNumber(int number) {
        StringBuilder out = new StringBuilder();
        out.append(number).append(" ");
        return out.toString();
    }

}
