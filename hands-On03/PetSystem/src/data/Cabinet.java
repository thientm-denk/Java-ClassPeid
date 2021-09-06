/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import util.MyToys;

/*
kỹ thuật dùng tủ đựng đồ
//cái tủ lưu các tool xử lý profile
//và lưu trữ profile
//thay vì viết ở main
 
 */
public class Cabinet {
    private ArrayList<Pet> petList = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    
    //tìm hồ sơ của cat/dog
    public int searchPetByID(String petID) {
        for (int i = 0; i <= petList.size() - 1; i++){
            if (petID.equalsIgnoreCase(petList.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
    //hỏi con pet đưa con pet
    public Pet searchPetObjectByID(String petID){
        if (petList.isEmpty()){
            return null;
        }
        for (Pet o : petList) {
            if(o.getId().equalsIgnoreCase(petID)){
                return o;
            }
            
        }
        return null;
    }
    //tìm pet show ìnor
    public void searchPetByID(){
        String id;
        Pet x;
        id = MyToys.getString("Input pet id: ", "Pet id is required");
        x = searchPetObjectByID(id);
        System.out.println("------------------------------------------");
        if (x == null) {
            System.out.println("Not Found");
        }else {
            System.out.println("Here is the pet" + "that you want search");
            x.showProfile();
        }
    }
    public void addNewDog(){
        String id, name;
        int yob;
        double weight;
        int pos;
        do {
            id = MyToys.getID("Input Dog ID(DXXXXX)", 
                    "The format of id is DXXXXX(X stands for a digit)", "^[D|d]\\d{5}$");
            pos = searchPetByID(id);
        }while (pos != -1);
        name = MyToys.getString("Input Dog Name: ", "The Dog name is required");
        yob = MyToys.getAnInteger("Input Dog yob(2000..2020): ", "Yob is from 2000 - 2020", 2000, 2020);
        weight = MyToys.getADouble("Input dog weight(0.1 - 99): ", "weight is from 0.1 - 99.0", 0.1, 99.0);
        petList.add(new Dog(id, name, yob, weight));
        System.out.println("add dog successfully");
    }
    public void addNewCat(){
        String id, name;
        int yob;
        double weight;
        int pos;
        do {
            id = MyToys.getID("Input Cat ID(CXXXXX)", 
                    "The format of id is CXXXXX(X stands for a digit)", "^[C|c]\\d{5}$");
            pos = searchPetByID(id);
        }while (pos != -1);
        name = MyToys.getString("Input Cat Name: ", "The Cat name is required");
        yob = MyToys.getAnInteger("Input Cat yob(2000..2020): ", "Yob is from 2000 - 2020", 2000, 2020);
        weight = MyToys.getADouble("Input Cat weight(0.1 - 99): ", "weight is from 0.1 - 99.0", 0.1, 99.0);
        petList.add(new Cat(id, name, yob, weight));
        System.out.println("add cat successfully");
    }
    public void update(){
        String id;
        Pet x;
        id = MyToys.getString("Input pet id: ", "Pet id is required");
        x = searchPetObjectByID(id);
        System.out.println("------------------------------------------");
        if (x == null) {
            System.out.println("Not Found");
        }else {
            System.out.println("Here is the pet" + "Before updating");
            x.showProfile();
            String tmpName = MyToys.getString("Input new name: ", "Name is required");
            x.setName(tmpName);
            System.out.println("The Pet info is update sucessfully!");
        }
        
    }
    public void removePet(){
        String id;
        int pos;
        id = MyToys.getString("Input pet id: ", "Pet id is required");
        pos = searchPetByID(id);
        System.out.println("------------------------------------------");
        if (pos == -1) {
            System.out.println("Not Found");
        }else {
            
            petList.remove(pos);
            System.out.println("The Pet info is remove sucessfully!");
        }
        
        
    }
    public void printPetListAscendingByName(){
        if(petList.isEmpty()){
            System.out.println("The case is empty, Nothing to print");
            return;
        }
        
        Collections.sort(petList, new Comparator<Pet>(){
            @Override
            public int compare(Pet p1, Pet p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        });
        System.out.println("------------------------------------");
        System.out.println("Here is the pet list");
        String header = String.format("|%-6s|%-15s|%-4s|%4s",
                "ID", "NAME", "YOB", "WEIGHT");
        System.out.println(header);
        for(int i = 0; i <= petList.size() - 1; i++){
            petList.get(i).showProfile();
        }
    }
    public void printPetListAscendingById(){
        if(petList.isEmpty()){
            System.out.println("The case is empty, Nothing to print");
            return;
        }
        
        Collections.sort(petList, new Comparator<Pet>(){
            @Override
            public int compare(Pet p1, Pet p2) {
                return p1.getId().compareToIgnoreCase(p2.getId());
            }
        });
        System.out.println("------------------------------------");
        System.out.println("Here is the pet list");
        String header = String.format("|%-6s|%-15s|%-4s|%4s",
                "ID", "NAME", "YOB", "WEIGHT");
        System.out.println(header);
        for(int i = 0; i <= petList.size() - 1; i++){
            petList.get(i).showProfile();
        }
    }
}
