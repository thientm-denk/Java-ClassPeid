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
public class Star {
    private String name;
    private int yob;
    private String hitSong;
    public String setName;
    
    //contructor: cái phễu của cái  khuôn(class)
    //cùng tên với class
    public Star(String name, int yob, String hitSong){
        this.name = name;
        this.yob = yob;
        this.hitSong = hitSong;
    }

    //show ra thông tin
    public void showInfor() {
        System.out.printf("%s|%d|%s\n", name, yob, hitSong);
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

    public String getHitSong() {
        return hitSong;
    }

    public void setHitSong(String hitSong) {
        this.hitSong = hitSong;
    }
    
    
    
    
}
