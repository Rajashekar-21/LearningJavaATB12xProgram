package ex_19_oops_part2.inheritance.multilevelinheritance;

public class Lab170_multilevel {
    public static void main(String[] args) {
        son s1 = new son();
        Father f1 = new Father();
        Grandfather gf1 = new Grandfather();
        s1.extra();
        s1.bhk1();

        //son s2 = new Father();
        Father f2 = new son();   // Dynamic dispatch
        Grandfather gf2 = new Father();
        Grandfather gf3 = new son();
    }
}
