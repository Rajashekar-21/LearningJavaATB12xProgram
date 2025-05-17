package ex_06_TernaryOperator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 17;
        String result = (number>18) ? (number>20 ? "you can drink in goa" : "cant drink") : "you cant go goa";
        System.out.println(result);
    }
}
