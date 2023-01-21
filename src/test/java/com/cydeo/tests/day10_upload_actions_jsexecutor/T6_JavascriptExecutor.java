package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executor_test1 (){

//1- Open a chrome browser
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

//2- Go to: https://practice.cydeo.com/infinite_scroll
//3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//a. 750 pixels down 10 times.
//b. 750 pixels up 10 times
        js.executeScript("window.scrollBy(0,7500)");
//JavaScript method to use : window.scrollBy(0,0)

    }



}
