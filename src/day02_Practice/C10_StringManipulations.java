package day02_Practice;

public class C10_StringManipulations {

    public static void main(String[] args) {

        //     * Ask the user for a word. If the word consists of 3 or more letters,
        //     * have the last two letters printed 3 times side by side. if not, print the entered word
        //     *
        //     * sample
        //     * input = Ali
        //     * output = lilili
        //     *
        //     * input = el
        //     * output = el

        String word = "Ali";


        if ( word.length()>=3){

//            System.out.print(word.substring(word.length()-2));
//            System.out.print(word.substring(word.length()-2));
//            System.out.print(word.substring(word.length()-2));

            String lastTwoChar= word.substring(word.length()-2);
            System.out.println(lastTwoChar.repeat(3));

        }else {

            System.out.println(word);
        }




    }
}
