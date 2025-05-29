package Tasks;

import java.util.Scanner;

public class Task8_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks");
        if (!sc.hasNextInt())
        {
            System.out.println("please enter the marks in numbers");
            return;
        }
        int marks = sc.nextInt();
        if (marks<0 || marks>100)
        {
            System.out.println("Please enter marks between 1 to 100");
        }
        char grade = 0;
        if (marks>=90){
            grade = 'A';
        } else if (marks>=80){
            grade = 'B';
        } else if (marks>=70){
            grade = 'C';
        } else if (marks>=60) {
            grade = 'D';
        }else {
            System.out.println("you are fail");
        }

        System.out.println("your grade is:" + grade);
    }
}
