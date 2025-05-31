package ex_15_String_Buffer_Builder_StringFunctions;

import java.util.Scanner;

public class Reverse_String_Without_Inbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter name");
        String name = sc.next();
       // for (int i=name.length()-1;i>=0;i--){
      //     System.out.print(name.charAt(i));
      //  }
StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);
    }
}
