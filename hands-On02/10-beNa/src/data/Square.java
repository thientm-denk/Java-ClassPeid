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
public class Square extends Rectangle{

    public Square(String owner, String color, double a) {
        super(owner, color, a, a);
    }
    
   @Override
   public void paint (){
       System.out.printf("Square| %-10s|%-10s|%6.2f|%6.2f|%6.2f\n",
               owner, color, a, getArea(), getPerimeter());
   }
   
   public void drawTitle(){
       System.out.println("Draw");
   }
    
    
    
}
