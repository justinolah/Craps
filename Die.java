
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
    
    public String toString()
    {
        String all = "";
        all += "+-------------+\n";
        if (roll == 1)
        {
        all += "+             +\n";
        all += "+             +\n";
        all += "+      *      +\n";
        all += "+             +\n";
        all += "+             +\n";
      }
      else if (roll == 2)
        {
        all += "+             +\n";
        all += "+   *         +\n";
        all += "+             +\n";
        all += "+          *  +\n";
        all += "+             +\n";
      }
      else if (roll == 3)
        {
        all += "+             +\n";
        all += "+      *      +\n";
        all += "+      *      +\n";
        all += "+      *      +\n";
        all += "+             +\n";
      }
        else if (roll == 4)
        {
        all += "+             +\n";
        all += "+  *       *  +\n";
        all += "+             +\n";
        all += "+  *       *  +\n";
        all += "+             +\n";
      }
        else if (roll == 5)
        {
        all += "+             +\n";
        all += "+  *       *  +\n";
        all += "+      *      +\n";
        all += "+  *       *  +\n";
        all += "+             +\n";
      }
      else 
        {
        all += "+             +\n";
        all += "+  *       *  +\n";
        all += "+  *       *  +\n";
        all += "+  *       *  +\n";
        all += "+             +\n";
      }
    all += "+-------------+";
        return all;
        
    }
 
}
