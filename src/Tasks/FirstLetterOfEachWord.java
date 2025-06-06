package Tasks;

import java.util.Scanner;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String input = sc.nextLine();
        if (input.isEmpty()){
            System.out.println("Empty string");
            return;
        }
        input = input.trim();
        input = input.replaceAll("\\s+", " ");
        System.out.print(input.charAt(0));
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)==' ' && input.charAt(i+1)!=' '){
                System.out.print(input.charAt(i+1));
            }
        }
    }
}
