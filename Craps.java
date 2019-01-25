
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean playing = true;
        if (start(in))
        {
            giveInstructions(in);
            while (playing)
            {
                Dice dice = new Dice();
                if (turn(in, dice))
                {
                    System.out.println("You won"); 
                }
                else
                {
                    System.out.println("You lost"); 
                }
                in.nextLine();
                System.out.println("Do you want to play again? (Y/n)");
                String answer = in.nextLine();
                if (!answer.equals("") && !answer.substring(0,1).equalsIgnoreCase("y"))
                {
                    playing = false;
                    System.out.println("Thanks for playing");
                }

            }
        }
    }

    public static boolean turn(Scanner in, Dice dice)
    {
        dice.rollDice();
        System.out.println(dice.toString());
        System.out.println("You rolled a " + dice.getDieRoll(1) + " and a " +dice.getDieRoll(2));
        int point = dice.getSum();
        if (point == 7 ||point == 11)
        {
            return true;
        }
        else if (point == 2 ||point == 3 || point == 12)
        {
            return false;  
        }
        while (true)
        {
            System.out.println("Roll again");
            in.nextLine();
            dice.rollDice();
            System.out.println(dice.toString());
            System.out.println("You rolled a " + dice.getDieRoll(1) + " and a " +dice.getDieRoll(2));
            if (dice.getSum() == 7)
            {
                return false;
            }
            else if (dice.getSum() == point)
            {
                return true;
            }
        }
    }

    public static boolean start(Scanner in)
    {
        System.out.println("Do you want to play craps? (Y/n)");
        String answer = in.nextLine();
        if (answer.equals("") || answer.substring(0,1).equalsIgnoreCase("y"))
        {
            return true; 
        }
        else
        {
            System.out.println("Wow that's awkward");
            return false;
        }
    }

    public static void giveInstructions(Scanner in)
    {
        System.out.println("Do you want instructions? (Y/n)");
        String answer = in.nextLine();
        if (answer.equals("") || answer.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("Roll two six-sided dice");
            in.nextLine();
            System.out.println("A sum of 7 or an 11 automatically wins");
            in.nextLine();
            System.out.println("But a sum of 2, 3, or 12 automatically loses");
            in.nextLine();
            System.out.println("A sum of 4, 5, 6, 8, 9, or 10 becomes the 'point'");
            in.nextLine();
            System.out.println("Continue to roll until the sum becomes either:");
            in.nextLine();
            System.out.println("     a. 7 which in which you lose");
            System.out.println("     b. the point in which you win");
            in.nextLine();
            System.out.println("Good luck");
            in.nextLine();
        }
    }
}
