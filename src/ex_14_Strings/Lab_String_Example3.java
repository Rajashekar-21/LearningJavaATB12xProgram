package ex_14_Strings;

public class Lab_String_Example3 {
    public static void main(String[] args) {
        String s = "Rajashekar";
        char c = s.charAt(4);
       System.out.println(c);

       System.out.println(s.codePointAt(0));
// ASCII comparision
       int result = "abc".compareTo("ABC");
       int result2 = "abc".compareToIgnoreCase("ABC");
       System.out.println(result);
       System.out.println(result2);

       int idx = "JAVA".indexOf("A");
        System.out.println(idx);
        int idx2 = "java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String re = "Java".replace('a','r');
        System.out.println(re);

        boolean b1 = "java".startsWith("j");
        System.out.println(b1);

        String jo = String.join("!","Hi","Pooja");
        System.out.println(jo);

    }
}
