package day01_Practice;

public class C03_PrimitiveDataTypes {


    // boolean , byte, short, int, long, float, double, char

    //byte, short, int, long are for whole numbers

    // float, double can take decimals


    //char can store only one character
    //boolean can store true or false

    //range : double > float > long> int >short > byte  //primitive numbers

    //Questions. Let's write max end min values of these data types

    // double is primitive   // Double

    public static void main(String[] args) {

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("double max number is: "+ doubleMaxValue);


        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Max number is : " +byteMaxValue);

        byte byteMinValue = Byte.MIN_VALUE;
        System.out.println("byteMinValue = " + byteMinValue);

        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("intMaxValue = " + intMaxValue);


    }






}
