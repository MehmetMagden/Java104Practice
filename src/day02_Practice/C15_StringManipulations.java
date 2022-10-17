package day02_Practice;

public class C15_StringManipulations {


    // "Java123 is 123432very 543092 funny234 234234"


    public static void main(String[] args) {

        String str = "Java123 is 123432very 543092 funny234 234234";


        str= str.replaceAll("[A-Za-z]","");
        System.out.println(str);

        str=str.replaceAll("\\s","");

        System.out.println(str);



    }

}
