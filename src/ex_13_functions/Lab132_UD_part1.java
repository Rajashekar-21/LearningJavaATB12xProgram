package ex_13_functions;

import java.util.Scanner;

public class Lab132_UD_part1 {
    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type
        //1
        WHP_WHR_greet();
        //2
        String s = WHP_WR_greet();
        System.out.println(s);
        //3
        WP_WHR_greet("raj", 27, 500000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name = scanner.next();
        System.out.println("ENTER AGE");
        int age = scanner.nextInt();
        System.out.println("ENTER SALARY");
        double salary = scanner.nextDouble();
        WP_WHR_greet(name,age,salary);
    }
    static void WHP_WHR_greet(){
        System.out.println("Hi Raja pooja");
    }
    static String WHP_WR_greet(){
        System.out.println("hello");
        return "Pooja";
    }
    static void WP_WHR_greet(String name, int age, double salary){
        System.out.println("your name is" +name+ "\n your age is" + age + "\n your salary is" + salary );
    }

}
