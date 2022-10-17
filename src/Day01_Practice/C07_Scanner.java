package Day01_Practice;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two numbers");

        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        System.out.println("sum of numbers = "+ (number1+number2));
        System.out.println("sum of numbers = "+ (number1*number2));
        System.out.println("sum of numbers = "+ (number1-number2));
        System.out.println("sum of numbers = "+ (number1/number2));



    }
}
