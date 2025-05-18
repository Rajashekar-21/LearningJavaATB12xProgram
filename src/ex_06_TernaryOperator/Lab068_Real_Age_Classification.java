package ex_06_TernaryOperator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 (age>18)-> adult (age<18)->minor (age>65)-> senior citizen
        String user_input = args[0];
        System.out.println(user_input instanceof String);
       System.out.println(user_input);

       int age = Integer.parseInt(user_input);
        System.out.println(age);
        String result = (age<18) ? "minor" : ((age<65) ? "adult" : "senior");
        System.out.println(result);
    }
}
