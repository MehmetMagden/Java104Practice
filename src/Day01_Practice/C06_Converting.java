package Day01_Practice;

import java.util.Scanner;

public class C06_Converting {

    public static void main(String[] args) {

        // let's code a program that changes the km to m

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the distance in km");
        double distanceInKm = scan.nextDouble();

        double distanceInM = distanceInKm * 1000;

        System.out.println("Entered distance in KM is = "+distanceInKm+"\nIt is = "+distanceInM+ "m");





    }
}
