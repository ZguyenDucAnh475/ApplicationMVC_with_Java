/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author NguyenDucAnh
 */
public class LinearSearchModel {

    private int[] array;

    public void generateArray(int size, int min, int max) {
        array = new int[size];
        Random randomNumber = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = randomNumber.nextInt(max - min + 1) + min;
        }

    }

    public int[] getArray() {
        return array;
    }

    public int linearSearch(int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // return the index of the found element
            }
        }
        return -1; // not found
    }
}
