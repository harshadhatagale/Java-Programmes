import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int guess, randNumber;

        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        System.out.println("________NUMBER GUESSING GAME 🔍________");
        while(true)
        {
            System.out.print("Enter the number (Between 1 & 6): ");
            guess= sc.nextInt();
            randNumber= rand.nextInt(1,7);
            if (guess==randNumber)
            {
                System.out.println("You guessed it right mf 🤩\n");
            }
            else
            {
                System.out.printf("Looser you are 😭, that was %d\n", randNumber);
            }
            sc.close();
        }
        
    }
}
