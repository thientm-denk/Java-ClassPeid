
package runtime;

//program là nơi để cho chương trình chạy

import data.Rectangle;
import data.Square;

public class Program {
    public static void main(String[] args) {
        Square s1 = new Square("Tía", "Hường", 15);
        Square s2 = new Square("Mợ", "Vàng", 3);
        Square ds[] = new Square[3];
        ds[0] = s1;
        ds[1] = s2;
        ds[2] = new Square("Con", "đỏ", 5);
        //for(int i = 0; i <= 2; i++){
          //  ds[i].paint();
        //}
        for (Square o : ds){
            o.paint();
        }
        
        
        Rectangle r1 = new Rectangle("Tía", "Hường", 15,3);
        Rectangle r2 = new Rectangle("Mợ", "Vàng", 3,4);
        Rectangle ds2[] = new Rectangle[2];
        ds2[0]= r1;
        ds2[1] = r2;
        
        for (Rectangle o : ds2){
            o.paint();
        }
    }   
}
