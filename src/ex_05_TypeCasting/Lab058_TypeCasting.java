package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        //int a = b;
        int a = (int)b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        System.out.println(a); // Widening Explicit Casting (int) - optional
    }
}
