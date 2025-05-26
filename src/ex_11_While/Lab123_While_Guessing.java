package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you think");
        int attempts = 0;
        while (true) {

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input, Please enter the number");
                sc.next();
                continue;
            }

            int guess = sc.nextInt();
            attempts++;

            if (guess<1 || guess>100)
            {
                System.out.println("please enter number between 1 to 100");
                continue;
            }
            if (guess<numberToGuess)
            {
                System.out.println("too low");
            } else if (guess>numberToGuess)
            {
                System.out.println("too high");
            }else
            {
                System.out.println("you guessed correct number in" +attempts+ "attempts");
                break;
            }


        }

    }
}
