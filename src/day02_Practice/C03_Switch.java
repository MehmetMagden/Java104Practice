package day02_Practice;

import java.util.Scanner;

public class C03_Switch {

    public static void main(String[] args) {

        //     Write a program that can show the days
        //     If the day is Monday or Tuesday:
        //     Java day
        //
        //     If the day is Thursday or Friday:
        //     Selenium day
        //
        //     If the day is Wednesday or Saturday:
        //     SQL day
        //
        //     otherwise: day off
        //     (DO NOT use the if statement)


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day");
        String day = scan.next().toLowerCase();
        //System.out.println(day);

        switch (day)  {

            case "monday" :
            case "tuesday" :
                System.out.println("Java day");
                break;

            case "thursday" :
            case "friday"  :
                System.out.println("Selenium day");
                break;
            case "wednesday":
            case "saturday":
                System.out.println("SQL day");
                break;
            default:
                System.out.println("Day off");
        }



    }




}
