/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.BinarySearchModel;
import view.BinarySearchView;

/**
 *
 * @author NguyenDucAnh
 */
public class BinarySearchController {

    private BinarySearchModel model;
    private BinarySearchView view;

    public BinarySearchController(BinarySearchModel model, BinarySearchView view) {
        this.model = model;
        this.view = view;
    }

    public void searchKey(int key){
        view.displayArray(model.getData());
        int resultIndex = model.binarySearch(key);
        view.displayResult(resultIndex, key);
    }
}
