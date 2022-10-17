package day01_Practice;

public class C14_NestedIf {

    // we will give cards to the users. And number of cards will be given by ages

    /*
    age <18  no card
    age >=70  three cards
    70 > age > 50  two cards
    50 > age >= 18  one cards

     */


    public static void main(String[] args) {

        int age = 19;


        if (age >= 18){

            if (age<50 ){
                System.out.println("one card for you");
            } else if (age>= 50 &&age <70) {
                System.out.println("two cardsfor you");

            }


        }





    }






}
