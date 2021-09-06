/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.PrintStream;

/**
 *
 * @author FPT
 */
public class Square {
    
    private int edge;
    //constructor
    public Square(int edge){
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
    
    public int peremeter(){
        return edge * 4;
    }
    public int area(){
        return edge * edge;
    }
    
    public void showInfor(){
        System.out.println("Hinh vuong co canh la: "+ edge);
        System.out.println("Chu vi hinh vuong la: " + peremeter());
        System.out.println("Dien tich hinh vuong la: " + area());
    }
   
}
