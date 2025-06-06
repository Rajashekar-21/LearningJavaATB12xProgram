package Tasks;

public class SumOfAnArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,34,16,12};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum+numbers[i];
        }
        System.out.println("sum of the elements :" +sum);
    }
}
