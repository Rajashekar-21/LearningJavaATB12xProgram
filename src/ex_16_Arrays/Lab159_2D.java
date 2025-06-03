package ex_16_Arrays;
import java.util.Arrays;
public class Lab159_2D {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] array2;
        array2 = new int [][]{{3,2,1},{6,5,4},{9,8,7}};

        int [][] array3 = new int[3][3];
        array3[0][0] = 9;
        array3[0][1] = 8;
        array3[0][2] = 7;

        array3[1][0] = 6;
        array3[1][1] = 5;
        array3[1][2] = 4;

        array3[2][0] = 3;
        array3[2][1] = 2;
        array3[2][2] = 1;

        System.out.println(Arrays.deepToString(array3));

    }
}

