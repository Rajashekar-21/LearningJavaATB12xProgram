package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_if_else_scanner {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("you can drink");
        }else{
            System.out.println("you cannot drink");
        }

    }
}
