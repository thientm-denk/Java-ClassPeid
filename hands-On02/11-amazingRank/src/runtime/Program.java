/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Motor;
import data.Pet;
import java.util.Random;

/**
 *
 * @author FPT
 */
public class Program {
    public static void main(String[] args) {
        //cuộc đua bắt đàu
        Pet d1 = new Dog("Vàng ơi", 1950, 10.0);
        Pet d2 = new Dog("Beto", 2010, 8.0);
        
        Cat c1 = new Cat("KITTY", 1974, 0);
        
        Pet h1 = new Hamster("MICKEY", 1928, 4.0);
        
        Pet racer[] = {d1, d2, c1, h1};
        
        for (Pet pet: racer){
            pet.showRecord();
        }
        //bàn riêng về gia đình nhà  pet
        //đua đêm, xuất hiện bóng đêm đi theo sau
        //ko bik rõ là chó hay mèo, nhưng bik là con gì đó nhỏ nhỏ
        Pet xxx = new Pet("xxx", 2021, 0.5){
            @Override
            public double run() {
                return new Random().nextDouble()*30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|XXX     |%-10s|%4d|%6.2f|%6.2f\n", name, yob, weight, run());
            }
        
        
        };
        xxx.showRecord();
        Motor ex = new Motor("EXCITER", 2021, 155, "56F8-2204");
        
        Motor win = new Motor("WIN2k2", 2020, 150, "56F8-6789");
        
        ex.showRecord();
        win.showRecord();
    }
}
