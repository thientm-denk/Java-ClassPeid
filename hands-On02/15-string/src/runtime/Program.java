/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import java.util.StringTokenizer;

/**
 *
 * @author FPT
 */
public class Program {
    public static void main(String[] args) {
        String str1 = new String("Do it now String");
        //khởi tạo str2 tham chiếu tới tham chiếu str1
        String str2 = str1;
        //String là imutable: bất kỳ thao tác nào trên string đều sẽ tạo ra object mới
        //nếu ko hứng object đó, mất luôn
        str1 = str1.concat("- Làm ngay đi");
        System.out.println(str1);
        System.out.println(str2);
          
        //String builder và Stringbuffer là 2 mutable class:
        //khi tác động vào chuỗi từ 2 class này thì chuỗi sẽ bị thay đổi 
        StringBuilder msg1 = new StringBuilder("Do it now String Builder");
        StringBuilder msg2 = msg1;
        msg1.append("-Ngay và luôn");
        System.out.println(msg1);
        System.out.println(msg2);
        
        //StringTokenizer
        String information = "SE130390|Điệp   |2000|9.9";
        StringTokenizer st = new StringTokenizer(information, "|");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
        System.out.println(information);
        playWithStringComparision();
        chamVoCuc();
        //hash: băm
        //nó dùng để mã hóa/cao
        //
    }
    public static void playWithStringComparision(){
        String s0 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");//heap
        String s1 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s2 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
        String s3 = "Bé hứa học hành chăm ngoan";//pool
        String s4 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");//heap
        //new lưu 2 vùng nhớ khác nhau
        if(s0 == s4){//so sánh 2 vùng nhớ, bị trật, so sánh địa chỉ
            System.out.println("bằng");
        }else{
            System.out.println("ko");
        }  
        
        s1 = "Hello";// là nhét 1 vùng nhớ mới
        System.out.println(s1);
        System.out.println(s2);
    }
    
    public static void chamVoCuc(){
        String msg = "Xin chào ngày mới";
        // POOL, newString() ngầm
        String msgU = msg.toUpperCase().toLowerCase();
        //chấm sẽ tạo ra object mới imultable, hàm loại 4;
        System.out.println(msgU);
    }
}
