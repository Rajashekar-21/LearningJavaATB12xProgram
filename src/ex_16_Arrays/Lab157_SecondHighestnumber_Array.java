package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_SecondHighestnumber_Array {
    public static void main(String[] args) {
         int [] num = {54,89,13,45,23,980,34,65};
         Arrays.sort(num);
        System.out.println(num[num.length-2]);

    }
}
