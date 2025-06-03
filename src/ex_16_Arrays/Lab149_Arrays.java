package ex_16_Arrays;

import java.util.Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {92,95,88,96,98,85};
        boolean[] is_married = {true,false,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        String name = "Rajashekar";
        String[] split_name = name.split("");
        System.out.println(Arrays.toString(split_name));
    }
}
