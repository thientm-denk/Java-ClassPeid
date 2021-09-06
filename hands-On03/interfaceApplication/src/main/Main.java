/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Student;
import util.Filter;
import util.FilterGeneric;

/*
ví dụ dưới đây sử dụng mảng sinh viên cho quen thuộc tính vs mọi  nguoiqf
các bạn có thể thay thể bằng các collections khác(List-ArrayList, Set-Hashset) mà ko khiến tư duy bài toán bị thay đổi
ta đang bàn về tính ướng dụng của interface, cách các hàm thống nhất vs nhau về tên gọi
sử dụng và triệu hồi

sau đó là linh hoạt trong cách cài đặt, sd mở rộng tổng quát hóa trong việc phối hợp
lẫn nhau, đó là ý nghĩa chính của interface

bài toán này mô phỏng câu lệnh sql select * from student where(điều kiện lọc sv)
//dùng Interface để linh hoạt trong ccahs đặt đk
ko cần làm mỗi hàm riêng cho lần lọc khác nhau

 */
public class Main {
    public static void main(String[] args) {
        Student list[] = initStudentList();
        
       // Filter whereGPA8 = new FilterByGPA();
        
        //selectStudents(list, whereGPA8);
        //Filter where1990To1995 = new FilterByYob() ;
        
        //selectStudents(list, where1990To1995);
        
        FilterGeneric<Student> whereAVERAGE = new FilterGeneric<Student>(){
            @Override
            public boolean check(Student x){
                return x.getBank().equalsIgnoreCase("AVERAGE");
            }
        };
        selectStudents(list, whereAVERAGE);
        
    }
    
    public static void selectStudents(Student list[], FilterGeneric whereCondition){
        if (list.length == 0){
            System.out.println("The list is empty. Nothing to filter");
            return;
        }
        System.out.println("The student list after filtering");
        for (Student o : list) {
            if (whereCondition.check(o)){
                o.showProfile();
            }
        }
    }
    
    public static Student[] initStudentList(){
        Student list[] = new Student[10];
        list[0] = new Student("SE01","Một",1991,1.0);
        list[1] = new Student("SE02","Hai",1992,2.0);
        list[2] = new Student("SE03","Ba",1993,3.0);
        list[3] = new Student("SE04","Bốn",1994,4.0);
        list[4] = new Student("SE05","Năm",1995,5.0);
        list[5] = new Student("SE06","Sáu",1996,6.0);
        list[6] = new Student("SE07","Bảy",1997,7.0);
        list[7] = new Student("SE08","Tám",1998,8.0);
        list[8] = new Student("SE09","Chín",1999,9.0);
        list[9] = new Student("SE10","Mười",2000,10.0);
        
        return list;
        
    }
}
