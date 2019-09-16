
/**
 * Write a description of class Pumpkin here.
 *
 * @author (Justin Mills)
 * @version (8/23/19)
 */
public class Pumpkin
{
    // instance variables - replace the example below with your own
    private int id;
    private double rad;

    
    public Pumpkin(double r, int id)
    {
        rad = r;
        this.id = id;
    }
    
    public double getRadius(){
     return rad;   
    }

    
}
