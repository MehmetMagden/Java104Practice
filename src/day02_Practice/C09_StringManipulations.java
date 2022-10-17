package day02_Practice;

public class C09_StringManipulations {

    public static void main(String[] args) {

        //	 	 // Find the sum of the following prices given as String
        //     // String str 1= "$13.99"
        //     // String str 2= "$10.55"
        //     // hint: You can use the double parseDouble() method.
        //
        //      /* Regular Expression(regex) : It helps us to select certain types of characters.
        //1) \\d ==> all numbers
        //\\D ==> all non-digit characters
        //2) \\w ==> A->Z a->z 0->9 _
        //\\W ==> A->Z a->z 0->9 Everything except _
        //3) \\s ==> space
        //\\S ==> everything except space
        // \\s+
        // */

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1=str1.replace("$","");
        str2=str2.replace("$","");

       // str1 = str1.replaceAll("\\D","");
       // str2 = str2.replaceAll("\\D","");


        double firstNumber = Double.valueOf(str1);
        double secondNumber = Double.valueOf(str2);

        System.out.println(firstNumber+secondNumber);


    }
}
