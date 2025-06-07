package ex_19_oops_part2.inheritance.singleInheritance.realExample;

public class TestCase2 extends commontoalltesta{
    void running_tc2(){
        Startbrowser();
        readexcelfile();
        readsqlfile();
        System.out.println("running tc2");
        closebrowser();
    }
}
