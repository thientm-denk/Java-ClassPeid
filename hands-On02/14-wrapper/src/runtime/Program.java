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
    public static void main(String[] agrs) {
        //wrapper class: class trai bao
        int a = 10; //primitive
        //4 byte trong ram được đặt tên và gán giá trị là 10
        //nó được on off thành 10
        
        //a.
        Integer b = new Integer(10);
        //đổ 10 vào lõi của integer object đặt tên là b
        //nó tự in unboxing và nhét 10 vào cái core của nó
        //boxing xảy ra khi Integer = primitive vào wrapper
        b = a;
        System.out.println(a);
        System.out.println(b.toString()); // gọi thầm tên em
        int c = b; //unboxing
        //unboxing xảy ra khi primitive = wrapper class
        System.out.println(c);
        
        Integer d = 2002;
        //tính toán hay dùng các phép so sánh đều giống primitive 
        //wrapper class tạo object nên object . được
        //có cơ chế auto unboxing và boxing
        b = d;
        if (b.compareTo(d) == 0) { //đối vs 2 biên primitive  so sánh như toán tử thường
            //object so sánh equal or compare
            //riêng wrapper so sánh như biến primitive
            //string ko phải là wrapper class
            
            System.out.println("bằng nhau");
        } else{
            System.out.println("ko");
        }
        
        
    }
    
}
