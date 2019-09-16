
/**
 * Write a description of class MMM here.
 *
 * @author (Justin Mills)
 * @version (9/10/10)
 */
public class MMM
{
    private int num1;
    private int num2;
    /**
     * Constructor for objects of class MMM
     */
    public MMM(int x, int y)
    {
       num1 = x;
       num2 = y;
    }

    public int addNumbers()
    {
        return num1 + num2;
    }
    
    public int subtractNumbers(){
     return num1 - num2;
    }
    
    public int multiplyNumbers(){
     return num1*num2;   
    }
}
