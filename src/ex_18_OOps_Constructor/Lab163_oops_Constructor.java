package ex_18_OOps_Constructor;

public class Lab163_oops_Constructor {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);

    }
}
class A{
    A(){
        System.out.println("i want to read the sov file");
        System.out.println("open the browser before loading the scripts");
        System.out.println("we can do what ever you want after creating the object");
    }
}