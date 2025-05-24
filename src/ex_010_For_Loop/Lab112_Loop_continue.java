package ex_010_For_Loop;

public class Lab112_Loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
