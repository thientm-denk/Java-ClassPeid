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
        /*
        math operator + - += -=...
        shift Operator
        << >>
        muốn chơi toán tử này phải chuyển từ thập phân sang nhị phân
        30/2 0
        15/2 1
        7/2 1
        3/2 1
        1/2 1
        11110 
        8 = 00000001000
        8 << 2 = 8 x 2 mũ 2 
        8 >> 2 = 8/ (2 mũ 2)
        */
        int number =  8;
        number = number >> 2;
        System.out.println(number);
        /*bitwise
            &: giống nhân
            |: gặp 1 thì lấy
            ^: khác nhau thì 1 
            ~: phủ định 101100 ~ 010011
        */
    }
    
}
