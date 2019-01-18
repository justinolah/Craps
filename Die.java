
/**
 * Write a description of class Die here.
 *
 * @author (Justin Olah)
 * @version (2019-1-18)
 */
import java.lang.Math;
public class Die
{
    private int roll;
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int roll()
    {
        roll = (int)(Math.random() * 6 +1); 
        return roll;
    }
    
    public int getRoll()
    {
        return roll;
    }
 
}
