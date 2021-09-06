/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author FPT
 */
public class Program {
    public static void main(String[] args) {
        //playWithInteger();
        //sortIntegers();
        //swapIntegers();
        playWithSet();
    }
    
    public static void playWithInteger() {
        int fb1[] = {1, 1, 2, 3, 5, 8, 13, 21};
        //đây là cách tạo mảng primitive bình thường
        int fb2[] = new int[8];
        //wrapper 
        Integer fb3[] = {1, 1, 2, 3, 5, 8, 13, 21};
        //boxing
        //fb3[0] = 1 //new ngầm Integer(1)
        //mảng object mà là mảng con trỏ integer
        //hàm ram vì cần new cho từng phần tử
        //mảng này là mảng chứa object nhưng ko có khả năng co giãn
        //bị giới hạn về mặt kích thước khi khỏi tạo
        //collections java
        ArrayList<Integer> fb = new ArrayList<Integer>();
        //vì nó co giãn nên khi khởi tạo ko cần liệt kê phần tử
        // ko cần báo số phần tử kèm theo
        //colections chỉ chơi với object thôi nên 
        //nên ArrayList<int>fb = new ArrayList<>();
        //fb sẽ trỏ tới 1 vùng new chà bá
        //nó quản lý các con trỏ trỏ tới vùng new rời rạc
        fb.add(new Integer(1)); // cứ new đi, rồi đưa cái vùng nhớ đó cho tao
        //để tao trỏ
        fb.add(1);//lưu vung nhớ của con số 1 chứ ko hề lưu 1
        //auto unboxing nên khi gọi thì nó ko trả rs địa chỉ mà trả luôn ra core
        fb.add(2);
        fb.add(3);
        fb.add(5);
        fb.add(8);
        fb.add(13);
        fb.add(21);
        //cách in một mảng
        //cách1
        for (Integer o : fb) {
            System.out.println(o);
        }
        //cách 2
        System.out.println(fb);
        //cách 3
        for (int i = 0; i < fb.size(); i++) {
            System.out.print(fb.get(i) + " ");
        //trả ra tọa độ của phần tử thứ i trong
        //chứ ko hề trả ra value
        // nhưng mà nhờ cơ chế unboxing auto nên nó mới show ra
        //value core của nó
        }
    }
    public static void sortIntegers() {
        ArrayList<Integer> ds = new ArrayList<>();
        //ArrayList ds2 = new ArrayList<>();
        //giỏ ds2, thích gì thì nhét đấy, miễn là object thì nhét vô
        //ko quan tâm cha con
        //ko hay ho đâu
        List<Integer> ds3 = new ArrayList<>();
        ds3.add(1);
        ds3.add(-1);
        ds3.add(10);
        ds3.add(40);
        ds3.add(30);
        ds3.add(12);
        System.out.println("Before sort: " + ds3);
        Collections.sort(ds3);
        Collections.reverse(ds3);
        //auto unboxing, tự lấy lõi so sánh
        //nếu là object bình thường thì ko thể so sánh 1 cách sơ sài đc
        //mà dựa vào 1 tiêu chí nào đó
        System.out.println("After sort: " + ds3);
      
    }
    public static void swapIntegers() {
        List<Integer> ds = new ArrayList<Integer>();
        ds.add(10000);
        ds.add(50);
        System.out.println("Array: " + ds);
        //toString là 1 hàm đặc biệt để show hết properties của object
        //bên C in ra con trỏ : địa chỉ
        //List vào thứ tự nào, ra thứ tự đó
        //hash : thì vào trước nhưng ra sau, lộn xộn
        //nhưng mà giờ muốn in ra 50 và 10000;
        //cụ thể là ds[0] = 50; ds[1] = 10000;
        //bạn swap như thế nào
        
        Integer tmp = ds.get(0);
        ds.set(0, ds.get(1));
        ds.set(1, tmp);
        System.out.println("Array: " + ds);
        
    }
    public static void playWithSet() {
        //set là 1 cái giỏ cấm trùng, ko cho phép nhiều hơn 1 con trỏ
        //trong giỏ cũng vùng new
        //ko chấp nhận chuyện 2 chàng trỏ 1 nàng
        Set<Integer> ds = new HashSet<>();
        ds.add(1000);
        ds.add(500);
        ds.add(700);
        ds.add(-10);
        System.out.println(ds);
        //thằng này vào ra lộn xộn, ko có method get
        //HASH MD5 SHA
        //HashSet phải sử dụng cặp bài trùng tên là equal, 
        //phải compare để điều khiển các object bên trong
        
        //Map là một giỏ ánh xạ: bỏ 1 con chó vào thì phải thêm nhận dạng
        //tại sao Map bị cho ra rìa khỏi Collections
        //vì Collections là bộ sưu tập chứa nhiều con trỏ
        //List/Set chỉ chứa 1 con trỏ bỏ vào - - - > nhiều theo đơn
        //Map lại đòi đến 2 con trỏ, con trỏ nhận dạng vùng new, 
        //con trỏ dùng để nhận dạng con trỏ
        //  nhiều theo cặp
    }
}
   