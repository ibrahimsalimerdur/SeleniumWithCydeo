package com.cydeo.tests.day5_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Selenium {

    WebDriver driver;

    @Test
    public void seleniumTest (){
        //Do browser driver setup

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");

        //Assert title is google
        Assert.assertEquals(driver.getTitle(),"Google","Title is not matching");


    }

}
