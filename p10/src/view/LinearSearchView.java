/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author NguyenDucAnh
 */
public class LinearSearchView {

    public void displayArray(int[] array) {
        System.out.println("Array: [");
        for (int num : array) {
            System.out.print(printNumber(num));;
        }
        System.out.println("]");
    }

    private String printNumber(int number) {
        StringBuilder out = new StringBuilder();
        out.append(number).append(" ");
        return out.toString();
    }

    public void displayResult(int index, int value) {
        if (index == -1) {
            System.out.println(String.format("Value %d not found in the array.", value));
        } else {
            System.out.println(String.format("value %d found at index: %d", value, index));
        }
    }

}
