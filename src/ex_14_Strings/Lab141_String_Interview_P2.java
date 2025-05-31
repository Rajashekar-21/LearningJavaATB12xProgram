package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> this checks the reference memory
        System.out.println(s1==s4);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s5);

        // = or .equals() contents in the variable
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
