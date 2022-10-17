package day02_Practice;

import java.util.Locale;

public class C11_StringManipulations {

    public static void main(String[] args) {

        //     *  Ask the user for 4 words and write them as a sentence and add . at the end
        //     *
        //     * Example : Inputs : courage, teaches, your, limits
        //     * Output : Courage teaches your limits.

        String str1= "coUrage";
        String str2= "TeaChes";
        String str3= "YOur";
        String str4= "LiMitS";


        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1).toLowerCase()+" "+
                str2.toLowerCase()+" "+str3.toLowerCase()+" "+str4.toLowerCase()+".");



    }
}
