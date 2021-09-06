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
public abstract class Pet implements Comparable<Pet> {
    protected String id;
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String id, String name, int yob, double weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.weight = weight;
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
    
    public abstract double run();
    public abstract void showProfile();

    @Override
    public int compareTo(Pet that) {
        return this.id.compareToIgnoreCase(that.id);
    }
    
    
    
}
