package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    //#1 - create private constructor
    private Singleton(){     }

    private static String word;

    public static String getWord(){
        if (word == null){
            System.out.println("First time call. Word is null");
        } else {
            System.out.println("Word already has value");
        }
        return word;
    }

}
