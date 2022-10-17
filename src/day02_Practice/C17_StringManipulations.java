package day02_Practice;

public class C17_StringManipulations {

    // get 4 letter string and print it in reverse

    public static void main(String[] args) {
        String str = "Java";

        System.out.print(str.charAt(str.length()-1));
        System.out.print(str.charAt(str.length()-2));
        System.out.print(str.charAt(str.length()-3));
        System.out.print(str.charAt(str.length()-4));

        System.out.println();
        System.out.println("----------------------");

        System.out.print(str.substring(3));
        System.out.print(str.substring(2,3));
        System.out.print(str.substring(1,2));
        System.out.print(str.substring(0,1));

    }



}
