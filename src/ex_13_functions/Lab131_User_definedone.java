package ex_13_functions;

public class Lab131_User_definedone {
    public static void main(String[] args) {
       int result_1 = sum_of_two_numbers(4,6);
       int result_2 = sum_of_two_numbers(35,64);
        System.out.println(result_2);
    }
    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }
}
