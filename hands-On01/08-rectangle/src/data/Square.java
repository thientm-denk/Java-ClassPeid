
package data;

//nhận cha bằng extends(biến dị những thuộc tính nổi trội hơn và kế thừa từ 1 cha)
public class Square extends Rectangle{
    //gọi lại hàm constructor - giữ nguyên đặc tính
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge); 
        //super là new cha
        //dùng constructor của cha
    }

    
    @Override
    //chỉ xuất hiện trong mối quan hệ cha con, is a, khi con muốn vượt mặt cha 
        //(độ lại hàm của cha) mà cha ko được xài --> tính đa hình
    //cũng là 1 hàm nhưng con xài theo kiểu khác, cha xài theo kiểu khác
    //vd cha cho 3 con 3 trứng, mỗi trứng đc xài theo mỗi luộc, chiên, xào khác nhau
    //tính kế thừa --> square con của rectangle
    public void paint(){
        System.out.printf("|Rectangle|%10s|%10s|%6.2f|%6.2f|%6.2f|%6.2f\n", 
                owner, color, width, height, getArea(), getPerimeter() );
    }
    
    
}
