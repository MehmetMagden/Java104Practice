package Day01_Practice;

import java.util.Scanner;

public class C10_IfStatements {

    public static void main(String[] args) {

        /*
        Grade Calculater
            A => 90 -  100
            B => 80 - 90
            C >  70 - 80
            D >  60 - 70
            F >  0  - 60
       */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade and I will calculate it");
        int grade = scan.nextInt();

        if( grade >= 90 && grade<=100) {
            System.out.println(" your grade is A, Great Job!!!");
        } else if (grade>= 80 && grade<90) {
            System.out.println("You made it B, it is okay");
        } else if (grade>= 70 && grade<80) {
            System.out.println("you pass C, thank you");
        }  else if (grade>= 60 && grade<70) {
            System.out.println("You made D, be more careful next time");

        }  else if (grade>= 0 && grade<60) {
            System.out.println("FAAAAIIIILLL!!!, Study more");

        } else {
            System.out.println("you entered an invalid number, please check it");
        }





        }

}
