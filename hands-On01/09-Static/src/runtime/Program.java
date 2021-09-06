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
        Star sonTung = new Star("Nguyen Thanh Tung", 1994, "Nam", "Chung ta cua hien tai");
        sonTung.showInfor();
        Star chiPu = new Star("Nguyen Thuy Chi", 1993, "Nu", "O o o");
        chiPu.showInfor();
        sonTung.showInfor();
    }
    //static la dac tinh xai chung
    
}
