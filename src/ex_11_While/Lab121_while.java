package ex_11_While;

import java.util.Scanner;

public class Lab121_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to factorial program");
        System.out.println("enter the number for factorial");
        if (!sc.hasNextInt())
        {
            System.out.println("please enter integer");
            return;
        }
        int number = sc.nextInt();
        int factorial = 1;
        if (number == 0)
        {
            System.out.println("factorila of 0 is" +factorial);
        }
        int i = 1;
        while (i <= number)
        {
         factorial = factorial*i;
         i++;
        }
        System.out.println("the factorial of given number is" +factorial);
    }
}
