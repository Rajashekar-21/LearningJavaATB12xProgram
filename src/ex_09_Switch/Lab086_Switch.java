package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values from (1 to 7)");
        int day = sc.nextInt();
        switch(day)
        {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
        }
    }
}
