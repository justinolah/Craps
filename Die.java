
/**
 * Write a description of class Die here.
 *
 * @author (Justin Olah)
 * @version (2019-1-18)
 */
import java.lang.Math;
public class Die
{
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int roll()
    {
        return (int)(Math.random() * 6 +1); 
    }
}
