package Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        String result = (age<=18) ? "minor" : ((age>=65) ? "senior" : "major");
        System.out.println(result);
    }
}
