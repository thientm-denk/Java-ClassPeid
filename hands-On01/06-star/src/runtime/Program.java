/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.Star;

/**
 *
 * @author FPT
 */
public class Program {
    public static void main(String[] args) {
        Star sonTung = new Star("Sơn Tùng MTP", 1994, "Em của ngày hôm qua");
        sonTung.showInfor();
        Star chiPu = new Star("Chi Pu", 1993, "ooooo");
        chiPu.showInfor();
        
        sonTung.showInfor();
        
    }
    
    
}
