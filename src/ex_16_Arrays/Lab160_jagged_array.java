package ex_16_Arrays;

import java.util.Arrays;

public class Lab160_jagged_array {
    public static void main(String[] args) {
        // Java allows jagged arrays where each row can have a different length
        int [][] jagged = {{1,2,3},{4,5,6,7},{8,9,1}};
        System.out.println(Arrays.deepToString(jagged));
    }
}
