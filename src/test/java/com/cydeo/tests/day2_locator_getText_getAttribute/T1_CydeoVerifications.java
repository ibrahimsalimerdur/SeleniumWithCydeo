package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://learn.cybertekschool.com");

        //Verify URL contains.
        //Expected : cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL Verification Passed!");
        } else {
            System.out.println("URL Verification Failed!");
        }

        String expectedTitle = "Sign In | Cydeo";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }

        Thread.sleep(6000);

        driver.close();



    }

}
