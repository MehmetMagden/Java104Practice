package day01_Practice;

import java.util.Scanner;

public class C13_NestedIfStatements {

    // we will give cards to the users. And number of cards will be given by ages

    /*
    age <18  no card
    age >=70  three cards
    70 > age > 50  two cards
    50 > age >= 18  one cards

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age  = scan.nextInt();

        if (age <18){
            System.out.println("no card for you");
        } else if (age>=18 && age <50) {
            System.out.println("one card for you");

        } else if (age>=50 && age<70) {
            System.out.println("two cards for you");

        } else if (age >=70) {
            System.out.println("three cards for you");
        } else {
            System.out.println("Please enter a valid age");
        }


    }






}
