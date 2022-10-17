package day02_Practice;

import java.util.Scanner;

public class C02_NesteTernary {

    public static void main(String[] args) {
        //    //    Define final grade, solve with Nested Ternary
        //    //     'A' -> "Very Successful"
        //    //     'B' -> "Successful"
        //    //     'C' -> "just enough"
        //    //     Print "Others.." for  other than these

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a capital letter");
        char letter = scan.next().charAt(0);

       String str = (letter=='A') ? ("Very Successful") : ( (letter=='B') ? ("Successful") : (  (letter=='C') ? ("just enough") : ("Others..")    )    ) ;
        System.out.println(str);

    }
}
