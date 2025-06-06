package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        if (s1.isEmpty()){
            System.out.println("empty string");
        }
        s1 = s1.trim();
        s1 = s1.replaceAll("\\s+"," ");
        String[] words = s1.split(" ");
        System.out.println(words.length);
        System.out.println(Arrays.deepToString(words));
    }
}
