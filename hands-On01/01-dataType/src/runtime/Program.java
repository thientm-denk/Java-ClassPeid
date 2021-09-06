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
       // System.out.println("hello");
       int age = 18;
       boolean check = true;
       char c = 65;
       System.out.println("c = " + c);
       //ta có byte là kiểu dữ liệu mới
       //nó là int nhưng ko quá giới hạn của 1 byte
       //tức là ko quá 127
       byte numberByte = 127;
       System.out.println("numberByte = " + numberByte);
       int numberInt = 200;
       //numberInt = numberByte; ép từ kiểu nhỏ sang kiểu lớn mới được
       float numberFloat = 6.6F;
       double numberDouble = 6.2;
       String character = "hello"; //  ko có kiểu char[]
       System.out.println("character = " + character);
       
       long money = 1_000_000_000_000_000_000L;
       System.out.println(money);
       
    }
}
/*
    Access Modifier
        public: ai cũng truy cập được
        protected: phải là mối quan hệ cha con thì mới được dùng
        default: chỉ những thằng nằm trong cùng 1 package mới được xài
        private: ko cho ai xài chung

    Non-Access Modifier
        final-->nếu dành cho class nghĩa là ko kế thừa đc
                \--thuộc tính thì là hằng số
        static-->tĩnh
                 dùng chung
                 1 class mà có thuộc tính là static thì tất cả các object đều xài chung thuộc tính đó
        abstract: trừu tượng
                    1 class mà có hành động method abstract 
nhưng 1 abstract class thì chưa chắc có abstract method

khi đặt tên vui lòng né những từ khóa sau đây: for, while, do, if, void, switch, case, 
                                                default, try, catch, finally, 
                                                this, import, synchronized, throw, throws, 
                                                package, enum, assert, super, extends, implements, 
                                                continue, break, return, new
        

*/
