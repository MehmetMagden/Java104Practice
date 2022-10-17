package day01_Practice;

import java.util.Scanner;

public class C11_IfStatements {

    public static void main(String[] args) {

        /*
         Print "Please enter your job title"
         Create a variable named jobTitle and ask the user.
         Use the test data below to print the correct jobTitle.
         Example:
         If the jobTitle is qa,print "your job title is Quality Analyst"
         if qa,print Quality Analyst
         if dev, print Developer
         if ba, print Business Analyst
         if pm, print Project Manager
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your job title");
        String jobTitle = scan.next().toLowerCase();

        if ( jobTitle.equals("qa")){
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");

        } else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");

        } else if (jobTitle.equals("pm")) {
            System.out.println("Project Manager");

        }else {
            System.out.println("Invalid enter");
        }


    }
}
