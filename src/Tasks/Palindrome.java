package Tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        if (s1.length()==0){
            System.out.println("empty string");
            return;
        }
        String rev = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
        if (s1.equalsIgnoreCase(rev)){
            System.out.println("the string is palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
