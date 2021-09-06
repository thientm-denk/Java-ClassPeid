/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import util.MyToys;

/**
 *
 * @author FPT
 */
public class Menu {
    private String menuTitle;
    private ArrayList<String> optionList = new ArrayList();
    
    public Menu(String menuTitle){
        this.menuTitle = menuTitle;
    }
    
    public void addNewOption(String newOption) {
        optionList.add(newOption);
    }
    public void printMenu(){
        if (optionList.isEmpty()){
            System.out.println("There is no Item in menu");
            return;
        }
        System.out.println("-----------------------");
        System.out.println("Welcome to " + menuTitle);
        for (String x: optionList) {
            System.out.println(x);
            
        }
    }
    public int getChoice(){
        int maxOption = optionList.size();
        String inputMsg = "Choose [1..." +maxOption+"]: ";
        String errorMsg = "you are required" + "to choose the option 1 ..." + maxOption;
        return MyToys.getAnInteger(inputMsg, errorMsg, 1, maxOption);
    }
    
}
