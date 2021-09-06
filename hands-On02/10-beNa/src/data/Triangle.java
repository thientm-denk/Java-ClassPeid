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
public class Triangle extends Shape{
    private double a, b ,c;

    public Triangle(String owner, String color, double a, double b, double c) {
        super(owner, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double getArea(){
        double p;
        p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getPerimeter(){
        return a+b+c;
    }
    @Override
    public void paint(){
        System.out.printf("Triangle|%-10s|%-10s|%6.2f|%6.2f|%6.2f|%6.2f|%6.2f|",
                owner, color, a, b, c, getArea(), getPerimeter());
    }
    
}
