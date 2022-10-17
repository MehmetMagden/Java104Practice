package day02_Practice;

import java.util.Scanner;

public class C05_Switch {

    public static void main(String[] args) {

        //  Print the writing of a three-digit number used entered


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a 3 digit number");
        int number = scan.nextInt();

        if(number>99 && number<=999) {


            int firstDigit = number % 10;
            System.out.println("firstDigit = " + firstDigit);
            number = number / 10;
            int secondDigit = number % 10;
            System.out.println("secondDigit = " + secondDigit);
            number = number / 10;
            int thirdDigit = number % 10;
            System.out.println("thirdDigit = " + thirdDigit);

            switch (thirdDigit){
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;


            }


            switch (secondDigit){

                case 2:
                    System.out.print(" twenty ");
                    break;
                case 3:
                    System.out.print(" thirty ");
                    break;
                case 4:
                    System.out.print(" forty ");
                    break;
                case 5:
                    System.out.print(" fifty ");
                    break;
                case 6:
                    System.out.print(" sixty ");
                    break;
                case 7:
                    System.out.print(" seventy ");
                    break;
                case 8:
                    System.out.print(" eighty ");
                    break;
                case 9:
                    System.out.print(" ninety ");
                    break;

            }

            switch (firstDigit){
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;

            }



        }
    }
}
