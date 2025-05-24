package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Switch_browser {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the browser name");
        String browser = sc.next();
        browser = browser.toLowerCase();
        switch (browser)
        {
            case "chrome" :
                System.out.println("starting the chrome");
                System.out.println("TC 1");
                System.out.println("TC 2");
                break;
            case "firefox" :
                System.out.println("starting the firefox");
                break;
            case "edge" :
                System.out.println("starting the edge");
                break;
            default:
                System.out.println("i have no idea about the browser");
        }
    }
}
