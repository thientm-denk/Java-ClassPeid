/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

//bản chất của interface là một abstract class.
//nếu đua mà chỉ quan tâm đến về đích, tăng tốc,.. k quan tâm an toàn nữa thì rõ ràng là 1 đua thủ
//nếu là 1 deadRacer thì hành động chính là phải đua đến chết
//Motor/Dog/Cat đều là 1 dạng của đua thủ


public interface DeadRacer {
    //interface ko lưu đặc tính chung hay riêng của các member
    //mình tham gia clb từ tứ phương, ko quan tâm vùng miền
    //vậy ko lưu đặc điểm nào hết
    //1 clb ko tạo ra member mới
    //ko cần phễu vì ko có đặc tính
    
    //nhưng nếu ta cố tình tạo 1 thuộc tính
    //ko cần khai báo public static final
    //vì tất cả các properties đều là hằng số trong interface
    String DEAD_RACER_DATE = "Ngày đua là ngày giỗ";
    
    //ỏe các phiên bản jdk9 trở lên
    //1 interface chỉ được có duy nhất 1 method mà thôi
    //để bổ trợ cho anotation interfaceFunctional phục vụ cho kỹ thuật
    //viết lamda
    
    //ko chứa bất kỳ hàm nào có body
    //interface chỉ chứa abstract mathod mà thôi
    //và vì như vậy nếu bạn tạo method mà thiếu từ abstract
    //thì nó tự hiểu
    public abstract double runToDead();
    public void showToQuocGhiCong();
    
    
    
    
}
