package Day01_Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // let's get name, surname, where are you from, age, hight, color of eyes, hair, Education level, where are you right now

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your all your name with surname");
        String nameAndSurname = scan.nextLine();

        System.out.println("Where are you from");
        String home = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println(" How tall are you? (cm)");
        int cm = scan.nextInt();

        System.out.println("what is your eyes' color?");
        String eyeColor = scan.nextLine();

        System.out.println("what is your education level");
        String educationLevel = scan.nextLine();

        System.out.println("where are you right now?");
        String place = scan.nextLine();

        System.out.println("*************************************************");
        System.out.println("nameAndSurname = " + nameAndSurname);
        System.out.println("home = " + home);
        System.out.println("age = " + age);
        System.out.println("cm = " + cm);
        System.out.println("eyeColor = " + eyeColor);
        System.out.println("educationLevel = " + educationLevel);
        System.out.println("place = " + place);
        System.out.println("*************************************************");


    }


}
