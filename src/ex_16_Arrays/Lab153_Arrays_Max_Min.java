package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] numbers = {34,66,12,87,11,45,779,42,433,65};
        int max = numbers[0];
        int min = numbers[0];

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("maximum number is" +max);
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("minimum number is" +min);
    }
}
