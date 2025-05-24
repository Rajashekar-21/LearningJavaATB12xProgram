package ex_09_Switch;

public class Lab093_JDK13_Above {
    public static void main(String[] args) {
        int a = 100;
        switch (a)
        {
         case 001 -> System.out.println("1");
         case 002 -> System.out.println("2");
         case 003 -> System.out.println("3");
            default -> System.out.println("no");
        }
    }
}
