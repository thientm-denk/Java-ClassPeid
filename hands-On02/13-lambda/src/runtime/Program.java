/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

/**
 *
 * @author FPT
 */
public class Program {
    public static void main(String[] args) {
        Math sum = new Math() {
            @Override
            public int calcu(int a, int b) {
                return a + b;
            }
        };
        // sum.calcu(4, 6);
        
        //dùng lambda bình thường
        Math Sub = (a, b)->{
            return a - b;
        };
        //dùng lambda nhanh
        Math mul = (a, b)->a*b;
       
        int result = mul.calcu(5, 2);
        System.out.println(result);
        
       
    }
    
}
//lambda chỉ có trong jdk8
//lambda chỉ viết code tạo object từ interface nhanh và gonj
//ta chỉ quy ước trong interface 

//tại sao nên chơi lambda
//1. viết code ít hơn
//2. cung cấp bản thực hiện giao diện chức năng (java web và java desktop)
//(argument list) -> body
//argument list: bỏ trống hoặc ko bỏ trống
//arrow token: nó được sd để liên kết argument list và body
//body chứa code
//nếu body có 1 dòng lệnh cần return và chỉ có 1 dòng mà thôi thì ko cần return 
@FunctionalInterface //trong interface chứa 1 cái phục vụ cho lambda
interface Math{
    public int calcu(int a, int b);  
}

