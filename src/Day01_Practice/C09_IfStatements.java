package Day01_Practice;

import java.util.Scanner;

public class C09_IfStatements {

    public static void main(String[] args) {

        // according to the answer of user Y/N

        // Y >>> Yes
        // N >>> No

        Scanner asdf = new Scanner(System.in);
        System.out.println("Please enter a value Y/N");

        char answer = asdf.next().charAt(0);

        if (answer=='Y' || answer=='y'){
            System.out.println("Yes");

        } else if (answer=='N' || answer=='n' ) {

            System.out.println("No");

        }


    }



}
