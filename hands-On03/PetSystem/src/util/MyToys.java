/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

//class chứa các hàm đồ chơi, dùng cho việc nhập dữ liệu

import java.util.Scanner;

public class MyToys {
    private static Scanner sc = new Scanner(System.in);
    
    public static int getAnInteger(String inputMsg, String errorMsg){
        int n;
        while(true) {
            try { //bắt sự kiện, bị lỗi bắt liền
            System.out.println(inputMsg);
            n = Integer.parseInt(sc.nextLine());
            return n;
            }catch(Exception e){
                System.out.println(errorMsg);
                
            }
        }
    }
    
    //xây dựng hàm lấy số nguyên nhưng lấy trong khoản từ lowerBound
    //đến upperBound
     public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upperBound){
         if (upperBound < lowerBound){
             int tmp = upperBound;
             upperBound = lowerBound;
             lowerBound = tmp;
         }
        int n;
        while(true) {
            try { //bắt sự kiện, bị lỗi bắt liền
            System.out.println(inputMsg);
            n = Integer.parseInt(sc.nextLine());
            if (n < lowerBound || n > upperBound) {
                throw new Exception();
            }
            return n;
            }catch(Exception e){
                System.out.println(errorMsg); 
            }
        }   
     }
     public static double getADouble(String inputMsg, String errorMsg, double lowerBound, double upperBound){
         if (upperBound < lowerBound){
             double tmp = upperBound;
             upperBound = lowerBound;
             lowerBound = tmp;
         }
        double n;
        while(true) {
            try { //bắt sự kiện, bị lỗi bắt liền
            System.out.println(inputMsg);
            n = Double.parseDouble(sc.nextLine());
            if (n < lowerBound || n > upperBound) {
                throw new Exception();
            }
            return n;
            }catch(Exception e){
                System.out.println(errorMsg); 
            }
        }   
     }
     //tạo nhập hàm tạo chuỗi theo một định dạng 
     //getIn
     public static String getID (String inputMsg, String errorMsg, String format){
         String id;
         boolean match;
         while(true) {
             System.out.println(inputMsg);
             id = sc.nextLine().trim().toUpperCase();
             match = id.matches(format);
             if (id.length() == 0 || id.isEmpty() || !match) {
                 System.out.println(errorMsg);
             }else{
                 return id;
             }
         }
     }
     public static String getString(String inputMsg, String errorMsg){
         String id;
         while(true) {
             System.out.println(inputMsg);
             id = sc.nextLine().trim();
             if (id.length() == 0 || id.isEmpty()) {
                 System.out.println(errorMsg);
             }else {
                 return id;
             }
         }
     }

    
    
}
