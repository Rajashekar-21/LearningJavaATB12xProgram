package Tasks;

import java.util.Scanner;

public class minNumberOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arry");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("elements at :" +i);
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("minimum number is:" +min);
    }
}
