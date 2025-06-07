package ex_18_OOps_Constructor;

public class car2 {
    String model;
    int year;

    car2(){
        model = "Honda";
        year = 2021;
        System.out.println("DC");
    }
    car2(String model_name, int mode_year){
        this.model = model_name;
        this.year = mode_year;
    }
    car2(String model_name){
        this.model = model_name;
    }
}
