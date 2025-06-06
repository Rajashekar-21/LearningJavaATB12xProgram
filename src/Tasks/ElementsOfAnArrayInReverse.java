package Tasks;

import java.util.Scanner;

public class ElementsOfAnArrayInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter the elements"+i);
            numbers[i] = sc.nextInt();
        }
        System.out.println("Reverse order");
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
