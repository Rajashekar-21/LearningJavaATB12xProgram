package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day value 1 to 7");
        if(sc.hasNextInt()){
            int day = sc.nextInt();
            switch (day)
            {
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("please enter numbers between 1 to 7");
            }
        }else
        {
            System.out.println("please enter the whole numbers");
        }
    }
}
