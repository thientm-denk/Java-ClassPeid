/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author FPT
 */
public class Cat extends Pet{
    //ko có gì khác cha thì thôi, nếu có thì liệt kê vào đây
    //giống như Disk thì có Radius
    public static  final double MAX_SPEED = 60.0;
    //tốc độ tối đa của chó là 50

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    @Override
    public double run(){
        return new Random().nextDouble()*MAX_SPEED;
        
    }
    public void showRecord(){
        System.out.printf("|Cat     |%-10s|%4d|%6.2f|%6.2f\n",
                name, yob, weight, run());
    }
   
}
