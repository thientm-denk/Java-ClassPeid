/*
    data
    tạo class Person(name, gender, yob)
    tạo hàm đối số và ko đối số
    tạo getter and setter
    tạo inputInfor(){} để nhắc người dùng nhập thông tin
    tạo method showInfor
    tạo class Student kế thừa person
//  id, gpa,gmail
    tạo hàm ko đối số
    tạo getter và setter ép người dùng cấm bỏ trống khi nhập thông tin của sinh viên
    email phải có @ và ko được có khoảng cách 
    showInfor(



    Program
    xây dựng menu gồm:
        1. Nhập vào 1 student
        2. Hiển thị thông tin sinh viên
        3. Hiển thị Max min theo đtb
        4. tìm kiếm theo mã sinh viên
        5. sort từ A đến Z theo tên và hiển thị ra
        6. Hiển thị các sv đc học bổng từ cao đến thấp thò giảm dần gpa >= 8.
        7. Thoát
 */
package runtime;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        
        int choose;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            showMenu();
            System.out.println("Vui lòng nhạp lựa chọn");
            //choose =scanner.nextInt();
            choose = Integer.parseInt(scanner.nextLine());
            
            switch (choose){
                case 1: {
                    System.out.println("Nhập sinh viên");
                    Student newStudent = new Student();
                    newStudent.inputInfor();
                    studentList.add(newStudent);
                    
                    break;
                }
                case 2: {
                    for (Student o : studentList) {
                        o.showInfor();
                    }
                    break;
                }
                case 3: {
                    //tìm nhiều đối tượng mới được
                    Student max = new Student();
                    Student min = new Student();
                   
                    
                    for (int i = 0; i <= studentList.size() - 1; i++) {
                        if (studentList.get(i).getGpa() < min.getGpa()){
                            min = studentList.get(i);
                        }
                        if (studentList.get(i).getGpa() > max.getGpa()){
                            max = studentList.get(i);
                        }
                    }
                    System.out.println("Sinh viên có điểm lớn nhất là");
                    for (Student student : studentList)  {
                        if (student.getGpa() == max.getGpa()) {
                            student.showInfor();
                        }
                    }
                    System.out.println("Sinh viên có điểm bé nhất là");
                    for (Student student : studentList)  {
                        if (student.getGpa() == min.getGpa()) {
                            student.showInfor();
                        }
                    }
                    
                    break;
                }
                case 4: {
                    String key;
                    System.out.println("Nhập mã mà bạn muốn tìm");
                    key = scanner.nextLine();
                    int count = 0;
                    
                    for (Student o : studentList) {
                        if (o.getId().equalsIgnoreCase(key)) {
                            count++;
                            o.showInfor();
                        }
                    }
                    if (count == 0){
                        System.out.println("Không có sinh viên nào");
                    }
                    break;
                }
                case 5: {
                    Comparator sortByName = new Comparator<Student>(){
                        @Override
                        public int compare(Student s1, Student s2) {
                            if (s1.getName().compareToIgnoreCase(s2.getName()) > 0) {
                                return 1;
                            }
                            return -1;
                        }
                    };
                    Collections.sort(studentList, sortByName);
                    for (Student o : studentList) {
                        o.showInfor();
                    }
                    break;
                }
                case 6: {
                    Collections.sort(studentList, new Comparator<Student>(){
                        @Override
                        public int compare (Student s1, Student s2) {
                            if (s1.getGpa() < s2.getGpa()) {
                                return 1;
                            }
                            return -1;
                        }
                    });
                    for(Student o : studentList) {
                        if (o.checkScholarship()){
                            o.showInfor();
                        }
                    }
                    break;
                }
                case 7: {
                    
                    break;
                }
                default: {
                    System.out.println("Vui long nhap tu 1 den 7");
                    break;
                }
            }
        }while(choose != 7);
        
    }
    public static void showMenu(){
         //xây dựng menu gồm:
        System.out.println("Menu quan ly sinh vien");
        System.out.println("1. Nhập vào 1 student");
        System.out.println("2. Hiển thị thông tin sinh viên");
        System.out.println("3. Hiển thị Max min theo đtb");
        System.out.println("4. Tìm kiếm theo mã sinh viên");
        System.out.println("5. Sort từ A đến Z theo tên và hiển thị ra");
        System.out.println("6. Hiển thị các sv đc học bổng từ cao đến thấp thò giảm dần gpa >= 8.");
        System.out.println("7. Thoát");
        
        
    }
    
}
