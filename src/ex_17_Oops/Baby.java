package ex_17_Oops;

public class Baby {
    String name;
    Baby(){
        System.out.println("Hi Pooja");
        name = "Pooja";
    }
    Baby(String n){
        name = n;
        System.out.println("Baby name is :"+name);
    }
}
