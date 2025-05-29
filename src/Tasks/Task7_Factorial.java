package Tasks;

import java.util.Scanner;

public class Task7_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number for factorial");
        if (!sc.hasNextInt())
        {
            System.out.println("please enter the number");
            return;
        }
        int n = sc.nextInt();
        int fact = 1;
        if (n<0){
            System.out.println("please enter number greater than 0");
            return;
        }
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factoril of given number is" +fact);
    }
}
