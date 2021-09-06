
package runtime;

import data.Rectangle;
import data.Square;

/**
 *
 * @author FPT
 */
public class Program {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle ("Cha", "Vàng", 1, 3);
        Square s1 = new Square ("con", "đỏ", 5);
        Rectangle ds[] = new Rectangle[2];
        //vì square là th đặc biệt của rectangle
        ds[0] = r1;
        ds[1] = s1;
        for (Rectangle o: ds){
            o.paint();
        }
           
    }
    
}
