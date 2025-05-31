package ex_15_String_Buffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Buffer {
    public static void main(String[] args) {
         // String -> 90%
        String name = "Raja";
        String s1 = new String("Pooja");

        // SB and SB -> 10%
        StringBuilder sb1 = new StringBuilder("Raja");
        StringBuffer sb2 =  new StringBuffer("Pooja");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1.reverse());
        System.out.println(sb2.reverse());
    }
}
