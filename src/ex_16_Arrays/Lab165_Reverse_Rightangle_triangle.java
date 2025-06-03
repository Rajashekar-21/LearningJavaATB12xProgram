package ex_16_Arrays;

import java.util.Scanner;

public class Lab165_Reverse_Rightangle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = sc.nextInt();
        for (int i = n; i > 0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
