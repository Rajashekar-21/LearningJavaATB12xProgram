package ex_14_Strings;

public class Lab_String_Example2 {
    public static void main(String[] args) {
        String s = "java".substring(2);
        System.out.println(s);

        String s1 = "java".substring(1,3);
        System.out.println(s1);

        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        String st = " java ".trim();
        System.out.println(st);

        boolean b = "  ".isBlank();
        System.out.println(b);

        String P = "Pooja".repeat(3);
        System.out.println(P);

        boolean b11 = "JAVA".equalsIgnoreCase("java");
        System.out.println(b11);

        String s12 = String.format("name = %s, age = %d","Raj",26);
        System.out.println(s12);


    }
}
