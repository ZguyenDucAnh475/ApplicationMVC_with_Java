/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author NguyenDucAnh
 */
public class FibonacciView {
    public void printFibonacciView(int[] sequence){
        System.out.println("Fibonacci Sequence: ");
        for(int num : sequence){
            System.out.print(printNumber(num));;
        }
        System.out.println("");
    }
    
    public void printTitle(String msg){
        System.out.println(msg);
    }
    
    
    private String printNumber(int number){
        StringBuilder out = new StringBuilder();
        out.append(number).append(" ");
        return out.toString();
    }
}
