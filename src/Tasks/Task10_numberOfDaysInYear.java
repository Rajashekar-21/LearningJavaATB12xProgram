package Tasks;

import java.util.Scanner;

public class Task10_numberOfDaysInYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the month");
        if (!sc.hasNextInt()){
            System.out.println("please enter integers");
            return;
        }
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
            return;
        }
        System.out.println("Please enter the year");
        if (!sc.hasNextInt()) {
            System.out.println("please enter integers");
            return;
        }
        int year = sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days in a month you entered");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days in a month you have entered");
                break;
            case 2:
                if ((year%4==0&&year%100!=0)||year%400==0){
                    System.out.println("29 days in february its leap year");
                }else {
                    System.out.println("28 days in february");
                }
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
