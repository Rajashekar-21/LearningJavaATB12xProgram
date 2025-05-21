package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first length");
        int a = sc.nextInt();
        System.out.println("enter second length");
        int b = sc.nextInt();
        System.out.println("enter third length");
        int c = sc.nextInt();
        if(a==b && b==c && a==c)
        {
            System.out.println("acute triangle");
        } else if (a==b || b==c || a==c)
        {
            System.out.println("right angle triangle");
        }else
        {
            System.out.println("obtuse triangle");
        }
    }
}
