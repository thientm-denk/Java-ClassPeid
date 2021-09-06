
package data;

/**
 *
 * @author FPT
 */
public class Disk {
    private String owner;
    private String color;
    private double r;

    public Disk(String owner, String color, double r) {
        this.owner = owner;
        this.color = color;
        this.r = r;
    }
    
    public double getPerimeter(){
        return 3.14*r*2;
    }
    public double getArea(){
        return r*r*3.14;
    }
    
    public void paint(){
        System.out.printf("|Disk|%10s|%10s|%6.2f|%6.2f|%6.2f\n",
                owner, color, r, getPerimeter(), getArea());
    }
    
    
}
