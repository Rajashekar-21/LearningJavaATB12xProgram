package ex_17_Oops;

public class Lab160 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "mahesh";
        s1.rollNo = 21;
        System.out.println(s1.name);
    }
}
class student{
    String name;
    int rollNo;

    void speak(){}
}