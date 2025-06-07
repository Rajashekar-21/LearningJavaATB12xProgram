package ex_18_OOps_Constructor;

import java.sql.SQLOutput;

public class LoginPage {
    public static void main(String[] args) {
        loginPage1 l = new loginPage1();
    }
}
class loginPage1{
    String name;
    loginPage1(){
        System.out.println("read file from sql");
        System.out.println("read file from java");
        System.out.println("read file from excel");
        System.out.println("login the page");
    }
}

