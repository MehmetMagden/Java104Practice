package day02_Practice;

public class C12_StringManipulations {

    public static void main(String[] args) {

        //Write a java program that returns the string, excluding the first two characters, when a string is entered.
        //            However, if the first character is 'g' and the second character is 'h',
        //             these characters should also be returned (gh - g - h : 3 cases)
        //          exp:          INPUT     OUTPUT
        //                          goat        gat
        //                         photo        hoto
        //                         ghost        ghost
        //                         kalem        lem


        String input = "photo";

        if (input.startsWith("gh")){
            System.out.println(input);
        } else if (input.startsWith("g")) {
            System.out.println(input.substring(0,1)+input.substring(2));
        } else if (input.charAt(1)=='h') {
            System.out.println(input.substring(1));
        }


    }
}
