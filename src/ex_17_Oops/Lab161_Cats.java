package ex_17_Oops;

public class Lab161_Cats {
    public static void main(String[] args) {
    cat c1 = new cat();
    cat c2 = null;
    c1.running();
    //c2.running();// null pointer exception
    }
}
class cat{
    String name;
    void running(){
        System.out.println("running");
    }
}