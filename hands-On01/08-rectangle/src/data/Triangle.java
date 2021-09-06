/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author FPT
 */
public class Triangle {
    private String owner;
    private String color;
    private double a,b,c;

    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        return Math.sqrt((getPerimeter() - a)*(getPerimeter() - b)*(getPerimeter() - c)* getPerimeter());
    }
    
    public void paint(){
        System.out.printf("|Tritangle|%10s|%10s|%6.2f|%6.2f|%6.2f|%6.2f|%6.2f\n", 
                owner, color, a, b, c, getPerimeter(), getArea());
    }
} 

