package Tasks;

public class evenAndOddFromArray {
    public static void main(String[] args) {
        int[] numbers =  {10,11,12,13,14,16,15,17,18,19,20};
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i]%2==0){
               System.out.println(numbers[i] +"is even");
           }else {
               System.out.println(numbers[i] +"is odd");
           }
        }
    }
}
