package ex_08_If_Condition;

public class Lab079_If {
    public static void main(String[] args) {
        String age = args[0];
        int new_age = Integer.parseInt(age);
        System.out.println(age);
        if(new_age>18) {
            System.out.println("you can vote");
        }else{
                System.out.println("cannot vote");
        }
    }
}
