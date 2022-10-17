package day02_Practice;

import com.sun.security.jgss.GSSUtil;

public class C13_StringManipulations {

    public static void main(String[] args) {

        // * If there is a  "xyz" in the entered String, write a method that returns false if not true
        //     *
        //     * input      output
        //     * axyzm  ==   true
        //     * xyz    ==   true
        //     * x.yz   ==   false
        //     * xyaz   ==   false

        String input = "x.yz";

        if( input.contains("xyz")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }




    }
}
