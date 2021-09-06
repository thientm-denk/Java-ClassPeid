/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

// con nhận cha abstract
//01. tạo class con trước
// kế thừa
public class Disk extends Shape {
    protected double a,b;
    public static final double PI = 3.1416f;
    // public: ai cũng lấy ra đc
    // static: các object đều có pi
    // final: Tạo là đặt giá trị và không sửa đc bên dưới
    // người ngoài muốn xài có thể Disk.PI
    private double radius;
    
    public Disk (String owner, String color, double radius){
        super(owner, color);
        this.radius = radius;
         // câu lệnh super là new cha
    //super phải nằm đầu vò có cha mới có con
    
    //overide là biểu hiện của tính đa hình (bất hiếu, con có nhưng cha ko thể xài)
    }
    
    @Override
    public double getArea() {
        return PI* Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return PI*2*radius;
    }
    
    @Override
    public void paint(){
        System.out.printf("|DISK|%-10s|%-10s|%6.2f|%6.2f|%6.2f\n",
                owner, color, radius, getArea(), getPerimeter());
    }
        
    
    
}
