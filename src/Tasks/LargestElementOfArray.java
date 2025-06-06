package Tasks;

import java.util.Scanner;

public class LargestElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i<numbers.length;i++){
            System.out.println("element at:"+i);
            numbers[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max = numbers[i];
            }

        }

        System.out.println("Max number is"+ max);

    }
}
