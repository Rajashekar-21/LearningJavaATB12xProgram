package ex_15_String_Buffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.append("programming");
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);

        sb.replace(0,4,"Python");
        System.out.println(sb);
    }
}
