package ex_16_Arrays;

public class Lab156_Sum_of_Arrays {
    public static void main(String[] args) {
        int[] num = {10,20,30};
        int sum = 0;
        for (int i=0; i< num.length; i++){
            sum = sum+num[i];
        }
        System.out.println(sum);
    }
}
