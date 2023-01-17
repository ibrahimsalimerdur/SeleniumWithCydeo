package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {

    @Test
    public void test1(){
        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        String PhoneNumber = faker.numerify("017# #### ###");
        System.out.println("PhoneNumber = " + PhoneNumber);

        //? question mark return into random letters
        System.out.println("faker.letterify(\"??????????\") = " + faker.letterify("??????????"));

        System.out.println("faker.bothify(\"#?#?##?#?#?#?#?#?#?#?\") = " + faker.bothify("#?#?##?#?#?#?#?#?#?#?"));

        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact().replaceAll(\"chuckNorris\",\"Halid\") = " + faker.chuckNorris().fact().replaceAll("chuckNorris", "Halid"));
    }
}
