package ex_15_String_Buffer_Builder_StringFunctions;

public class Lab147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        sb.reverse();
        System.out.println(sb);
    }
}
