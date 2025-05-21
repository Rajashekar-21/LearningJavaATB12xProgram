package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        int max;
        if(a>=b && a>=c)
        {
            max=a;
        }
        else if(b>=a && b>=c)
        {
            max=b;
        }
        else
        {
            max=c;

        }
        System.out.println("biggest number is:" +max);
    }
}
