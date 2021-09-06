/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 name nickname old birthday;
    tạo phểu hàm không đối số
    tạo phểu có đối số 
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại
    tạo hàm showInfor
 */
public class Author {
    private String name;
    private String nickname;
    private int old;
    private String birthday;

    public Author() {
    }

    public Author(String name, String nickname, int old, String birthday) {
        this.name = name;
        this.nickname = nickname;
        this.old = old;
        this.birthday = birthday;
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getOld() {
        return old;
    }

    public String getBirthday() {
        return birthday;
    }
    public void input(ArrayList<Author> authorList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Nickname: ");
        while(true) {
            this.nickname = sc.nextLine();
            boolean isFind = false;
            for (Author aut : authorList) {
                if (aut.nickname.equalsIgnoreCase(this.nickname)){
                    isFind = true;
                }
            }
            if (!isFind){
                break;
            }else{
                System.err.println("Nickname bị trùng.");//in màu đỏ, báo lỗi
            }
        }
        input();
    }
    
    public void input(){//cuốn sách này ko nằm trong list name author có sẵn 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        this.name = sc.nextLine();
        System.out.println("Tuổi: ");
        this.old  = Integer.parseInt(sc.nextLine()); //tránh buffer
        System.out.println("Nhập ngày sinh: ");
        this.birthday = sc.nextLine();
        
        
    }

    public void showInfor() {
        System.out.printf("\n%-20s|%-20s|%-20s|%10d", name, nickname, birthday, old);
    }

    
    
}
