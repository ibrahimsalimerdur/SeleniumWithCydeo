package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//Window Handle practice
//1. Create new test and make set ups
//2. Go to : https://www.amazon.com
//3. Copy paste the lines from below into your class
//4. Create a logic to switch to the tab where Etsy.com is open
//5. Assert: Title contains “Etsy”

public class T1_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod (){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handlin_test (){
        driver.get("https://www.amazon.com");
//3. Copy paste the lines from below into your class        
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        
//4. Create a logic to switch to the tab where Etsy.com is open
        Set <String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
           driver.switchTo().window(each);
        }
        

    }




}
