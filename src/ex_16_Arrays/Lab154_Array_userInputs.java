package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Array_userInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        String[] friends = new String[size];

        for (int i = 0; i < friends.length; i++) {
            System.out.println("enter the names" + i);
            friends[i] = sc.next();
        }

        // for (String we : friends){
        //     System.out.println(we);
   // }
        System.out.println(Arrays.toString(friends));

    }
}
