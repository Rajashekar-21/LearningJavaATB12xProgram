package ex_02_Java_Basics_Part2;

public class Lab_025_Constants {
    public static void main(String[] args) {
        int a = 10;
        a = a+1;
        System.out.println(a);
        final int b = 15;
       // b = b+1; java: cannot assign a value to final variable b
        System.out.println(b);

    }
}
