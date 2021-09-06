
package data;

//tạo 1 class tên là Square
//tạo ra 1 cái khuôn để đúc object Square  
public class Square {
      
    double edge;
    String color;
    String owner; //tên
    //thuộc tính/field/properties/attribute
    
    //constructor
    //tên phễu trùng tên với class
    //phễu phải public
    public Square(String owner, String color, double edge){
        this.edge = edge;
        this.color = color;
        this.owner = owner;
    }
    
    //getter and setter
    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    
    //method tính diện tích
    public double getArea(){
        return edge*edge;
    }
   //method tính Chu vi
    public double getPerimeter(){
        return edge*4;
    }
    //method vẽ hình
    public void paint(){
        System.out.printf("|Square|%10s|%10s|%6.2f|%6.2f|%6.2f\n",
                owner, color, edge, getArea(), getPerimeter());
    }
    
}
