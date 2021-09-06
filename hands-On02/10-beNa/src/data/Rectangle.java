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
public class Rectangle extends Shape {
    protected double a, b;

    public Rectangle(String owner, String color, double a, double b) {
        super(owner, color);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double getArea(){
        return a*b;
    }
    
    @Override
    
   public double getPerimeter(){
       return (a+b)*2;
   }
   @Override
    public void paint() {
        System.out.printf("|Rectangle|%-10s|%-10s|%6.2f|%6.2f|%6.2f|%6.2f\n",
                owner,color,a,b,getArea(),getPerimeter());
    }
    
    
}
