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
public class Dog extends Pet{
    private static final double MAX_SPEED = 60.0;

    public Dog(String id, String name, int yob, double weight) {
        super(id, name, yob, weight);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double run() {
        return new Random().nextDouble() + MAX_SPEED;
    }

    @Override
    public void showProfile() {
        String msg;
        msg = String.format("|%6s|%-15s|%4d|%4.1f|%4.1f|",
                id, name, yob, weight, run());
        System.out.println(msg);
    }
}