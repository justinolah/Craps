
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    private Die d1;
    private Die d2;
    
    /**
     * constructs a new dice list
     */
    public Dice()
    {
        d1 = new Die();
        d2 = new Die();
    }
    
    public int[] getRoll()
    {
        int[] result = {d1.getRoll(), d2.getRoll()};
        return result;
    }
    
    public void rollDice()
    {
       d1.roll();
       d2.roll();
    }
    
    
}
