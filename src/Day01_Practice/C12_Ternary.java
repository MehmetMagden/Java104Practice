package Day01_Practice;

import java.util.Scanner;

public class C12_Ternary {


    /*
     *  Write a code using Ternary. Define a variable named price. if price is
     * Less than 10 "cheap", between 10 and 20 "normal", and 20 or more than 20 expensive
     * never mind
     */

    public static void main(String[] args) {

        // if it is higher than 10 "expensive"
        //if it is lower than 10 "cheap"
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter the price");
        double price = scan.nextDouble();
        System.out.println("First Simple Ternary");
        System.out.println((price > 10) ? ("expensive") : ("cheap"));

        System.out.println("************");
        System.out.println((price <= 10) ? ("cheap") : (  (price < 20) ? ("normal") : ("expensive"))  );

        System.out.println("************");
        System.out.println(price <= 10 ? "cheap" : price < 20 ? "normal" : "expensive");

    }


}
