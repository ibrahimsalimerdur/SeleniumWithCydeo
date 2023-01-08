package com.cydeo.tests.day5_testNG_Intro_dropdowns;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {



    @Test (priority = 1)
    public void test1() {
        System.out.println("Test1 is running");
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test (priority = 2)
    public void test2() {
        System.out.println("Test2 is running");
        String actual = "apple";
        String expected = "apple1";

        Assert.assertTrue(actual.equals(expected));
    }


    @BeforeClass
    public void setupMethod (){
        System.out.println("---> Before  Class is running");
    }

    @AfterClass
    public void tearDownClass (){
        System.out.println("---> After  Class is running");
    }

    @BeforeMethod
    public void setUpMethod (){
        System.out.println("---> Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod (){
        System.out.println("---> After Method is running");
    }


}
