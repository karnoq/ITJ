// Simulates 24 random dice rolls.
// Each roll has two dice. 
// Prints "He won" if any roll contained double sixes.
// Prints "He lost" otherwise.

import java.util.Random;

public class TwoDiceTwentyFourTimes
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        boolean heWins = false;
        
        // YOUR CODE HERE
        // Write a loop to simulate 24 dice rolls. 
        // Track whether the Chevalier de Meré wins or not
        if(heWins)
        {
            System.out.println("He won!");
        }
        else
        {
            System.out.println("He lost");
        }
    }
}

// public class DiceGame
// {
//     Random generator;
//     
//     public DiceGame()
//     {   
//         generator = new Random(45);
//     }
//     /** 
//      * Throw a die four times and bet on at least one 6. 
//      * @return true if the chevalier wins. 
//      */
//     public boolean game1()
//     {
//         // YOUR CODE HERE
//         // Use the instance variable generator to simulate 
//         // 4 die rolls. 
//         // Return true if the chevalier wins (at least one is a 6).
//         boolean result = false;
//         
//         for (int i = 0; i < 4; i++)
//         {
//             int roll = generator.nextInt(6) + 1;
//             
//             if (roll == 6)
//                 result = true;
//         }
//         return result;
//     }
//     
//     /**
//      * Throw two dice 24 times and bet on at least one double-six.
//      * @return true if the chevalier wins. 
//      */
//     public boolean game2()
//     {   
//         // YOUR CODE HERE 
//         // Use the instance variable generator to simulate 
//         // 24 rolls of a pair of dice.
//         // Return true if at least one pair is both 6s. 
//         boolean result = false;
//         
//         for (int i = 0; i < 24; i++)
//         {
//             int die1 = generator.nextInt(6) + 1;
//             int die2 = generator.nextInt(6) + 1;
//             
//             if (die1 == 6 && die2 == 6)
//                 result = true;
//         }
//         
//         return result;
//     }
// }
