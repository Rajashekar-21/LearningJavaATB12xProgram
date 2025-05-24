package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemCode = 005;
        switch (itemCode)
        {
            case 004,005,006:
                System.out.println("electronics");
                break;
            case 001,002,003:
                System.out.println("mech");
        }
    }
}
