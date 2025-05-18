package ex_06_TernaryOperator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        int n3 = 12;
        int max = (n1>n2) ? (n1>n3) ? n1 : n3 : ((n2>n3) ? n2 : n3);
        System.out.println(max);
    }
}
