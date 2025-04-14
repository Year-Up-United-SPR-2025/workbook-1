package com.pluralsight;



public class Main { //this is the start of a class


//a method
    public static void main(String[] args ) { //start of argument

    String word1 = "Hello"; //the text in the double quotes are a string

    String word2= "World"; //its being expressed as a literal

    String greeting;

    greeting = word1 + " " + word2 + "!"; //a concatenation

        System.out.println(greeting);


        ////////////////////////////////////////////////////

        float taxRate = 0.15f;

        long aLargeNum = 222222L;


        ////////////////////////////////////////////////

        int aint;

        long blong;

        aint = 7;

        blong = aint;


        /// ///////////////////////////

        long aLong;
        int bInt;

        aLong =7_000_000_000L; //makes an overflow -1589934592
        //bInt = aLong; //gives error possible lossy conversion from long to int if not using type casting
        bInt = (int) aLong; //using type casting by the (int) =

        System.out.println(bInt);
    }

}
//end method

//This is the end of the class
