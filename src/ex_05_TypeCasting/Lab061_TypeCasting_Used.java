package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 500;
        float GST = 18.45f;
        //int total = course+GST;
        float total1 = course+GST;
        float total2 = (float)course+GST;
       // int total3 = course+(int)GST;
        System.out.println(total2);
    }
}
