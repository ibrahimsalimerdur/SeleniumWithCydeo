package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1() {
        Faker faker1 = new Faker();

        System.out.println("faker.name().firstName() = " + faker1.name().firstName());

    }



}