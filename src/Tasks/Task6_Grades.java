package Tasks;

import java.util.Scanner;

public class Task6_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your grade");
        String grade = sc.next();
        switch (grade){
            case "A"-> System.out.println("Excellent");
            case "B"-> System.out.println("very good");
            case "C"-> System.out.println("good");
            case "D"-> System.out.println("needs improvement");
            case "E"-> System.out.println("fail");
            default -> System.out.println("invalid grade");
        }
    }
}
