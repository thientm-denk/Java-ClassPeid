package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class Rectangle {
    double width;
    double height;
    String owner;
    String color;
    public Rectangle(String owner, String color, double width, double height){
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return width *height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }
    public void paint(){
        System.out.printf("|Rectangle|%10s|%10s|%6.2f|%6.2f|%6.2f|%6.2f\n", 
                owner, color, width, height, getArea(), getPerimeter() );
    }
}
