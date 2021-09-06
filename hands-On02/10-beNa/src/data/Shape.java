/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
// cha chứa nhân tử chung của đám con
// properties: color owner
// methos: getter/setter.

// hậu tận thế
//  dùng abstract khi muốn gom nhiều thằng về chung 1 cha
//  chung thuộc tính hoặc không, chung methos khác body
//  abstract có thể chưa methos bình thường và abstract methos
//  1 class mà có methos abstract -> abstract class
// tác dụng abstract để đưa vào chung một mảng
public abstract class Shape {
    protected String owner;
    protected String color;

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //tạo ra methos tính chu vi diện tích
    //nhưng không thêm vào công thức
    //cha không định nghĩa ( không viết body)
    //đứa nào kế thừa thì tự viết body
    //đứa nào kế thừa không sửa thì là abstract
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
   
    
    // đây là khái niệm chưa được định nghĩa;
    
    // Abstract class có thể chứa methos không phải abstract
    // không tạo được object như bt, nếu ngoan cố tạo bằng toán tử new tạo ra anonymous class
    // gọi là kỹ thuật anonymous
}
