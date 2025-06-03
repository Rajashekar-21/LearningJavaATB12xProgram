package ex_16_Arrays;

public class Lab162_SecondHighest {
    public static void main(String[] args) {
        int[] numbers = {12,56,13,87,89,65,98,24};
        int highest = 0;
        int second_highest = 0;

        for (int i = 0; i < numbers.length ; i++) {
             int num = numbers[i];
             if (num>highest){
                 second_highest = highest;
                 highest = num;
        } else if (num>second_highest && num!=highest) {
                 second_highest = num;
             }
        }
        System.out.println("second highest is:" +second_highest);
    }
}
