package Movies.CodSoft;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {

    public static void main(String args[])
    {


        Random  rand = new Random();                                            // An instance of java Random class is used to generate random numbers.  


        int randomNumber = rand.nextInt(100) + 1;                               // Set The Of Random Number Between 100 So That
       

        while(true)                                                             // while(true) means Whenever The Condition is not False                                   
        {                                                                       // It will run the Program and when playerGuess is Equal to randomNumber Then
            System.out.println("Enter your guess (1-100):");                    // It will Break the Loop and Give the Output that You Win.

            Scanner sc = new Scanner(System.in);                        

            int playerGuess = sc.nextInt();                                     // Take the Input of playeGuess From Scanner class.

            if(playerGuess == randomNumber)                                     // Then the condition if the playerGuess is equal to randomNumber
            {                                                                   // Then It will Print Correct You Win and break the Loop.
                System.out.println("Correct! You Win!");
                break;
            }

            else if(randomNumber > playerGuess)                                 // if the randomNumber is Greater Than the playerGuess
            {                                                                   // Then the randomNumber is Higher.
                System.out.println("Nope! The Random Number is Higher.");
                System.out.println("Guess Again.");
            }

            else
            {                                                                   // else the randomNumber is Less Than the playerGuess
                System.out.println("Nope! The Random Number is Lower.");        // Then the randomNumber is Lower.
                System.out.println("Guess Again");
            }
        }
    }
}


   

