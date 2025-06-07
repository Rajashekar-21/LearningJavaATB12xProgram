package ex_18_OOps_Constructor;

public class Lab165_Const {
    public static void main(String[] args) {
        car2 c2 = new car2();
        System.out.println(c2.model);
        System.out.println(c2.year);

        car2 c3 = new car2("nano",2020);
        System.out.println(c3.model);
        System.out.println(c3.year);


        car2 c4 =  new car2("Toyota");
        System.out.println(c4.model);
    }
}
