package day02_Practice;

import java.util.Scanner;

public class C07_StringManipulations {


    // /Ask user to enter first and last name, then print full name in console in capital letters

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scan.nextLine();
        System.out.println("please enter your last name");
        String lastName = scan.nextLine();

        name = name.toUpperCase();
        lastName= lastName.toUpperCase();

        System.out.println(name+" "+lastName);



    }


}
