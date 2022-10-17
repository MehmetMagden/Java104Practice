package day02_Practice;

import java.util.Scanner;

public class C01_NestedIf {


    //		Ask the user to enter a word.
    //* If the word contains an odd number of characters and 3 or more characters,
    //* print the character in the middle of the word.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a word");
        String str = scanner.next();

        if(str.length()%2==1 && str.length()>=3 ){

            int midCharIndex =(str.length()-1)/2;

            System.out.println(str.charAt(midCharIndex));




        }


    }

}
