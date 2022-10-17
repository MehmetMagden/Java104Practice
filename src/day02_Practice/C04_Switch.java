package day02_Practice;

import java.util.Scanner;

public class C04_Switch {
    //			 * * * Write a code that prints a sentence when one of the first
    //			 * 3 capital letters is selected from the user (use switch case)
    //* sample
    //* User : choose one of the letters A , B , C


    //If selected A, ==> Java is easy
    //If B is selected, ==> Java is fun
    //If he chose C, ==> I need to study :)


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a capital");
        char letter = scan.next().charAt(0);

        switch (letter) {

            case 'A':
            case 'a':
                System.out.println("Java is easy");
                break;
            case 'B':
            case 'b':
                System.out.println("Java is fun");
                break;
            case 'c':
            case 'C':
                System.out.println("I need to study");
                break;
            default:
                System.out.println("please enter one of abc");

        }

    }


}
