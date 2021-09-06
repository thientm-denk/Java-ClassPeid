/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;
import java.util.Random;

/**
 *
 * @author FPT
 */
public class Program {
     public static void main(String[] args) {
         Disk d2 = new Disk("Ca heo", "Vang", 3.4);
         Disk d3 = new Disk("Ca heo", "Vang", 3.4);
         Rectangle d1 = new Rectangle("Ca ca", "Do", 5, 6);
         Square d4 = new Square ("Ca Koi", "Trang", 2);
         Triangle d5 = new Triangle("Ca vang", "Vang", 7, 8, 9);
         Shape ds[] = new Shape[5];
         ds[0] = d2;
         ds[1] = d3;
         ds[2] = d1;
         ds[3] = d4;
         ds[4] = d5;
         
         for (Shape o: ds) {
             o.paint();
         }
         //muốn có object ta cần: (ko quan tâm class là class con/độc lập)
        //khuôn phễu
        //new để gọi phễu
        //biến con trỏ = new??; trỏ tới vùng dc new
        //Dog chihuahua = new Dog??
        //object còn có gì khác ko?
        //giống như công thức trên khuôn, new, biến
        // Square vuong = new Square()
        
        /* tuy nhiên, nhìn vào vùng ram của con có chút đặc biệt, nhìn tổng thể là cùng 1 new
        nhưng trong vùng new này có vùng new của cha 
        mục đích/ý nghĩa: 
            phục hồi lại mọi thứ của con như khi chưa kế thừa cha
            con làm được những việc như khi đứng một mình
        object con nhiều sâu sẽ là:
            Square s1 = new Square();
                new Rectangle();
            code của riêng con thì sao?(override)
        =============>Class con: new cha+code của riêng con
                                    super
                                    di truyền - tính kế thừa biến dị extend square kế thừa rectangle
        */
        Rectangle r1= new Rectangle("Cha", "Tim", 3, 4);//là vùng nhớ của cha, tất cả cha là con xài được, của con cha ko xài được
        Rectangle s1 = new Square ("Con", "Vang", 3); //khai cha, nhưng là của new con, ko xài được những hàm riêng của con, trừ @override
        Square s2 = new Square ("Con2", "Do", 2);//khai con, new con, xài được tất cả của con và cha
        
        r1.paint();
        
        s1.paint();
        
        ((Square)s1).drawTitle();//drift // ép kiểu của cha để xài được của code riêng con, vì khai cha
        s2.paint();
        /*
            cha là abstract thì con ra sao:
            con chỉ có new cha + code riêng của con
                        super //phải viêt lại các hàm abstract
                            //còn có method khác thì cha méo care
            nếu cha là abstract :
            new cha + code cho abstract của cha, thế là xong
            =>tạo riêng 1 class để implement all abstract cho cha
            //làm rõ explicit các hành động method của cha
            // nhưng nếu lười vẫn muốn tạo được object từ abstract 
            //nhưng lại ko muốn làm class trung gian
            //bắt buộc phải dùng kỹ thuật: mượn gió bẻ mang
            //annonymous
        */
        //chơi trò take away/handmade   
        /*
            shape x = new shape();
                trong class ??? này phải implements tất cả các code của cha 
        mình đã làm biếng tạo class trung gian thì phải code tay
        cuối cùng dù đã tạo được object thì class đó vẫn chưa có tên 
        //====>annomyous
        //cái vùng mà mình làm biếng tạo class riêng thì gọi là annomyous class
        //ưu điểm ko cần tạo class trung gian 
                viết class ngay trong main nhanh
        //nhược điểm : ko tái sử dụng cái khuôn đó được
        //chỉ có copy mới được
        //vd như đồ gốm
        
        //ứng dụng trong GUI
        //vd: như đi ăn đám cưới
        
        
        
        
        
        
        */
        Shape x;
         x = new Shape("Bes Na","7color"){
             @Override
             public double getArea() {
                 Random rd = new Random();
                 return rd.nextDouble()*50;
             }

             @Override
             public double getPerimeter() {
                 return new Random().nextDouble()*50;
             }

             @Override
             public void paint() {
                 System.out.printf("|???    |%-10s|%-10s|%6.2f|%6.2f\n",
                         owner, color, getArea(), getPerimeter());
             }
   
         };
         x.paint();
        
        
     }
     
    
}
