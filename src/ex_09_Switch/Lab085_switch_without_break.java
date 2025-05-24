package ex_09_Switch;

import java.util.Scanner;

public class Lab085_switch_without_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number from 1 to 7");
        int day = sc.nextInt();
        switch(day)
        {
                case 1 :
                System.out.println("Monday");
                case 2 :
                System.out.println("TUE");
                case 3 :
                System.out.println("WED");
                case 4 :
                System.out.println("THU");
                case 5 :
                System.out.println("FRI");
                case 6 :
                System.out.println("SAT");
                case 7 :
                System.out.println("SUN");
            default:
                System.out.println("please enter numbers between 1 to 7");

        }
    }
}
