package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class T5_Windows_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test() {

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("mainWindowHandle = " + mainWindowHandle);

        String expectedTitleText = "Windows";
        String actualTitle = driver.getTitle();


        Assert.assertEquals(actualTitle ,expectedTitleText);

        WebElement ClickHere = driver.findElement(By.linkText("Click Here"));
        ClickHere.click();

        Set <String> allWindowHandles = driver.getWindowHandles();

        for (String each: allWindowHandles ) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);
        System.out.println("Title after click: " + actualTitle);

        driver.switchTo().window(mainWindowHandle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
/*
1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */