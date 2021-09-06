/*
    tạo class Student kế thừa person
      id, gpa,gmail
    tạo hàm ko đối số
    tạo getter và setter ép người dùng cấm bỏ trống khi nhập thông tin của sinh viên
    email phải có @ và ko được có khoảng cách 
    showInfor(
 */
package data;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Student extends Person{
    private String id;
    private float gpa;
    private String email;

    //constructor ko đối số
    public Student() {
    }

    
    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if(id != null) {
            this.id = id;
            return true;
        }else{
            System.err.println("Vui lòng điền thông tin");
            return false;
        }
    }

    public float getGpa() {
        return gpa;
    }

    public boolean setGpa(float gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
            return true;
        }else{
            System.err.println("Vui long nhap cua 0 -10");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        }else{
            System.err.println("Email phải có @, không có khoảng cách, ko bỏ trống");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    
    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfor();
        System.out.println("Nhập ID: ");
//        while (true) {
//           String inputID = scanner.nextLine(); 
//           boolean check = setId(inputID);
//           if(check){
//               break;
//           }
//        }
        while(!setId(scanner.nextLine())); // đảo ngược lại từ false thành true // true thì break
        System.out.println("Nhập GPA: ");
        while(!setGpa(Float.parseFloat(scanner.nextLine())));
        System.out.println("Nhập Email: ");
        while(!setEmail(scanner.nextLine()));
    
    }
    @Override
    public void showInfor(){
        System.out.printf("%-10s|%-10s|%-10s|%3.1f|%4d|%-10s", id, name, gender, gpa, yob, email);
    }
    public boolean checkScholarship () {
        if (this.getGpa() > 8) {
            return true;
        }
        return false;
        
    }
     
}
