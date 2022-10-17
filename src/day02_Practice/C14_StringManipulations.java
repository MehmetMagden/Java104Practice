package day02_Practice;

public class C14_StringManipulations {

    //		Create the name1 and name2 variables.
    //If the number of characters in the variable name1 is even, place name2 in the middle of the word.
    //If the number of characters of the variable name1 is odd,
    //print "we could not place".
    //
    //		          e.g:
    //		         name1= mehmet
    //		         name2= ahmet
    //		         Print ==> mehahmetmet

    public static void main(String[] args) {

        String name1 ="muhammed";
        String name2 ="ALI";

        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));

        }



    }
}
