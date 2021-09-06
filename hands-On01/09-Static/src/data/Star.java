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
    String name;
    int yob;
    static String gender;
    String hitSong;
    

    public Star(String name, int yob, String gender, String hitSong) {
        this.name = name;
        this.yob = yob;
        this.gender = gender;
        this.hitSong = hitSong;
    }

   
    public void showInfor(){
        System.out.printf("|%10s|%4d|%10s|%10s\n", name, yob, gender, hitSong);
    }
    
    
    
}
