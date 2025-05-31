package ex_14_Strings;

import java.util.Locale;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Rajashekar";   // String constant pool
        name.toUpperCase();  // name.toUpperCase() returns a new string, but you did not store it.
        System.out.println(name); // Rajashekar
    }
}
