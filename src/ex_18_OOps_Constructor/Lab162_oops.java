package ex_18_OOps_Constructor;

public class Lab162_oops {
    public static void main(String[] args) {
       Baby b1 =  new Baby();
       new Baby();
       new Baby();
       Baby b2;
    }
}
class Baby{
    String name;

    //Default constructor
    Baby(){
        System.out.println("Object created i am called");
    }
}