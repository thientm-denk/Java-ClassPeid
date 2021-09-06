/*
 tạo class Person(name, gender, yob)
    tạo hàm đối số và ko đối số
    tạo getter and setter
    tạo inputInfor(){} để nhắc người dùng nhập thông tin
    tạo method showInfor
 */
package data;

import java.util.Scanner;

public class Person {
    protected String name; //cho kế thừa
    protected String gender;
    protected int yob;

    public Person() {
    } // ko đối số/ ko paramenter

    public Person(String name, String gender, int yob) { // có đối số đày đủ
        this.name = name;
        this.gender = gender;
        this.yob = yob;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void inputInfor() {
        //khi mà muốn nhập thì cần  có bộ Scanner;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập Giới tính: ");
        this.gender = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        this.yob = scanner.nextInt();
    }
    
    public void showInfor() {
        System.out.printf("\n%-10s|%-10s|%4d", name, gender, yob);
    }
    
    
}
