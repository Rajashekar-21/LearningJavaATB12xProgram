package ex_18_OOps_Constructor;

public class Lab164_Car {
    public static void main(String[] args) {
        car c1 = new car();
        c1.model = "Tesla";
        c1.year = 2025;
        System.out.println(c1.model);
        System.out.println(c1.year);

        car c2 = new car();
        c2.model = "Nano";
        c2.year = 2022;
        System.out.println(c2.model);
        System.out.println(c2.year);
    }
}
