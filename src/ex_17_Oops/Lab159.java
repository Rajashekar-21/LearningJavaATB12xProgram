package ex_17_Oops;

public class Lab159 {
    public static void main(String[] args) {
        ATBx ref = new ATBx();
        ref.name = "Rajashekar";
        ref.age = 27;
        ref.course_name = "java";
        ref.doAssignment();


        ATBx ref2 = new ATBx();
        ref2.name = "Pooja";
        ref2.eat();
        System.out.println(ref2.name);
    }
}
