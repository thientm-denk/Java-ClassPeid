/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.Cabinet;
import ui.Menu;

/*
 Quản lý hệ thống chăm sóc thú cưng gồm các tính năng như sau:
 Menu
"1. Add a new dog profile"
"2. Add a new cat profile"
"3. Search a pet profile by id"
"4. Update a pet profile by id"
"5. Delete a pet profile by id"
"6. Print the pet list ascending by id"
"7. Print the pet list ascending by name"
"8. Quit"

//Nhập id cho pet: có rồi thì bắt nhập lại
// nhập id cho pet phải chuẩn format
//vs: nhập id cho chó thì phải có chữ D ở đầu và 6 số sau
// thì ép nhập lại ngay
 */
public class Program {
    public static void main(String[] args) {
        Menu menu = new Menu("Happines Pet Care System");
        menu.addNewOption("1. Add a new dog profile");
        menu.addNewOption("2. Add a new cat profile");
        menu.addNewOption("3. Search a pet profile by id");
        menu.addNewOption("4. Update a pet profile by id");
        menu.addNewOption("5. Delete a pet profile by id");
        menu.addNewOption("6. Print the pet list ascending by id");
        menu.addNewOption("7. Print the pet list ascending by name");
        menu.addNewOption("8. Quit");
        
        Cabinet cage = new Cabinet();
        int choice;
        do {
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice){
                case 1:{
                    System.out.println("You are preparing to input a new dog" + "profile: ");
                    cage.addNewDog();
                    break;
                }
                case 2:{
                    System.out.println("You are preparing to input a new cat"+ "profile: ");
                    cage.addNewCat();
                    break;
                }
                case 3:{
                    System.out.println("You are preparing to input a pet id"+ "to search profile: ");
                    cage.searchPetByID();
                    break;
                }
                case 4:{
                    System.out.println("You are preparing to input a new dog" + "to update: ");
                    cage.update();
                    break;
                }
                case 5:{
                    System.out.println("You are preparing to input a new dog" + "to delete: ");
                    cage.removePet();
                    break;
                }
                case 6:{
                    System.out.println("You are preparing to input a new dog" + "ascending by id: ");
                    cage.printPetListAscendingById();
                    break;
                }
                case 7:{
                    System.out.println("You are preparing to input a new dog" + "ascending by name: ");
                    cage.printPetListAscendingByName();
                    break;
                }
                
                case 8:{
                    System.out.println("bye,bye");
                    
                    break;
                }
                
                
                
            }
            
        }while(choice != 8);
    }
    
}
//regex
